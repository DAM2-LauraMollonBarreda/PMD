package com.lauramb.practica6_quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class PantallaSecundaria extends AppCompatActivity {
    TextView texto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_secundaria);

        texto= (TextView) findViewById(R.id.txtvTexto);
        boton=(Button)findViewById(R.id.btnBoton);

        Bundle extras = getIntent().getExtras();
        texto.setText(extras.getString("Resultado correcto"));
        boton.setText(extras.getString("Boton"));
        Boolean esUltima = extras.getBoolean("Ultima");


        boton.setOnClickListener(view -> {


            if(boton.getText().equals("Siguiente")){
               super.onBackPressed();
            }else{
                Intent nuevo = new Intent(this,MainActivity.class);
                startActivity(nuevo);
            }
        });
    }




}