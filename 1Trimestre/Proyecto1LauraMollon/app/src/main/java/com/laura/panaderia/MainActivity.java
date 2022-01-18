package com.laura.panaderia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellLocalizacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellLocalizacion= findViewById(R.id.rellLocalizacion);

        rellLocalizacion.setOnClickListener(view -> {
            //Intent intent = new Intent(this)
        });
    }
}