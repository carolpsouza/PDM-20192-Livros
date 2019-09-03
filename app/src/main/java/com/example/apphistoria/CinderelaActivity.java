package com.example.apphistoria;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class CinderelaActivity extends AppCompatActivity {

    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinderela);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(new Locale("pt-BR"));
                tts.speak("A menina desobedeceu a madrasta e acabou perdendo o sapato dela. Mas por causa disso ela se casou.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }
}


