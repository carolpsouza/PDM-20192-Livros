package com.example.apphistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class BrancaActivity extends AppCompatActivity {

    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branca);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(new Locale("pt-BR"));
                tts.speak("A mulher quase morre porque é bonita e vai morar com 7 anões. Aí ela come uma maçã sem procedencia nenhuma e desmaia e acontece igual a outra que mete o dedo na agulha.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }
}
