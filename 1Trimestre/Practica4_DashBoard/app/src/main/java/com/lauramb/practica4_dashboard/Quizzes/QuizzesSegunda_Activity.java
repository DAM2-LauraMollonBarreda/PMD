package com.lauramb.practica4_dashboard.Quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.lauramb.practica4_dashboard.R;

public class QuizzesSegunda_Activity extends AppCompatActivity {
    TextView texto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes_segunda);
        setTitle("Quizzes");
        texto= (TextView) findViewById(R.id.txtvTexto);
        boton=(Button)findViewById(R.id.btnBoton);

        Bundle extras = getIntent().getExtras();
        texto.setText(extras.getString("Resultado correcto"));
        boton.setText(extras.getString("Boton"));
        Boolean esUltima = extras.getBoolean("Ultima");


        boton.setOnClickListener(view -> {


            if(boton.getText().equals(getString(R.string.siguiente))){
                super.onBackPressed();
            }else{
                Intent nuevo = new Intent(this,Quizzes_Activity.class);
                startActivity(nuevo);
            }
        });
    }


}