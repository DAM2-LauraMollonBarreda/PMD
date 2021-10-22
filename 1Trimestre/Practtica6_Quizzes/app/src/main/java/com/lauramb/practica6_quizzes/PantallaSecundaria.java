package com.lauramb.practica6_quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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


        boton.setOnClickListener(view -> {
            String textBoton = boton.getText().toString();
            String next="Siguiente";

            /*if(textBoton==next){*/
               super.onBackPressed();
            /*}else{
                Intent nuevo = new Intent(this,MainActivity.class);
                startActivity(nuevo);
            }*/
        });
    }




}