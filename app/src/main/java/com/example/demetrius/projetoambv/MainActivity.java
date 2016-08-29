package com.example.demetrius.projetoambv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnProximo;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProximo=(Button)findViewById(R.id.btnProximo);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent it= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(it);
                finish();
            }
        });
    }
}
