package com.example.apphistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class RapunzelActivity extends AppCompatActivity {

    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rapunzel);
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(new Locale("pt-BR"));
                tts.speak("A mulher deixa o cabelo crescer pra fugir da torre que ela está presa e ao invés de ir embora pra Paris vai e casa com o homem que ajudou ela a fugir", TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }
}