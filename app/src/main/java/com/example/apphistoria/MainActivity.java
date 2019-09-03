package com.example.apphistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBelaClick(View view) {
        Intent intBelaAdormecida = new Intent(getApplicationContext(), BelaAdormecida.class);
        startActivity(intBelaAdormecida);
    }

    public void onCindClick(View view) {
        Intent intCinderela = new Intent(getApplicationContext(), CinderelaActivity.class);
        startActivity(intCinderela);
    }

    public void onBrancaClick(View view) {
        Intent intBranca = new Intent(getApplicationContext(), BrancaActivity.class);
        startActivity(intBranca);
    }

    public void onRapunzelClick(View view) {
        Intent intRapunzel = new Intent(getApplicationContext(), RapunzelActivity.class);
        startActivity(intRapunzel);
    }
}
