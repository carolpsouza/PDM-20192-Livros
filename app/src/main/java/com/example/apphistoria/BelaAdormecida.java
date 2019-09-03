package com.example.apphistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class BelaAdormecida extends AppCompatActivity {

    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bela_adormecida);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(new Locale("pt-BR"));

                tts.speak("A menina fincou o dedo na agulha e dormiu e só acordou quando um cara deu um beijo nela", TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }
}