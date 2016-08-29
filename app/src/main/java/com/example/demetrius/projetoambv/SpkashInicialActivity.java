package com.example.demetrius.projetoambv;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpkashInicialActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spkash_inicial);

        Handler handler=new Handler();
        handler.postDelayed(this,3000);
    }

    @Override
    public void run() {
        Intent it= new Intent(SpkashInicialActivity.this,MainActivity.class);
        startActivity(it);
        finish();
    }
    }

