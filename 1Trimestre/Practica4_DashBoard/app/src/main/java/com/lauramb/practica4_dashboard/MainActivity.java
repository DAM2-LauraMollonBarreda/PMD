package com.lauramb.practica4_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.lauramb.practica4_dashboard.Amigos.Amigos_Activity;
import com.lauramb.practica4_dashboard.Calculadora.Calculadora_Activity;
import com.lauramb.practica4_dashboard.EdadCanina.EdadCanina_Activity;
import com.lauramb.practica4_dashboard.Galeria.Galeria_Activity;
import com.lauramb.practica4_dashboard.Mapas.Mapas_Activity;
import com.lauramb.practica4_dashboard.Musica.Musica_Activity;
import com.lauramb.practica4_dashboard.Quizzes.Quizzes_Activity;
import com.lauramb.practica4_dashboard.Hoteles.Hoteles_Activity;
import com.lauramb.practica4_dashboard.Settings.Settings_Activity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_calculadora, rellay_amigos, rellay_perrete,rellay_quizzes, rellay_galeria, rellay_mapas,rellay_restaurantes, rellay_settings,rellay_musica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay_calculadora = findViewById(R.id.rellay_calculadora);
        rellay_amigos = findViewById(R.id.rellay_amigos);
        rellay_perrete = findViewById(R.id.rellay_perrete);
        rellay_quizzes = findViewById(R.id.rellay_quizzes);
        rellay_galeria = findViewById(R.id.rellay_galeria);
        rellay_mapas = findViewById(R.id.rellay_mapas);
        rellay_restaurantes = findViewById(R.id.rellay_restaurantes);
        rellay_settings = findViewById(R.id.rellay_settings);
        rellay_musica=findViewById(R.id.rellay_musica);



        rellay_calculadora.setOnClickListener(view -> {
            Intent intent = new Intent(this, Calculadora_Activity.class);
            startActivity(intent);
        });

        rellay_amigos.setOnClickListener(view -> {
            Intent intent = new Intent(this, Amigos_Activity.class);
            startActivity(intent);
        });

        rellay_perrete.setOnClickListener(view -> {
            Intent intent = new Intent(this, EdadCanina_Activity.class);
            startActivity(intent);
        });
        rellay_quizzes.setOnClickListener(view -> {
            Intent intent = new Intent(this, Quizzes_Activity.class);
            startActivity(intent);
        });
        rellay_galeria.setOnClickListener(view -> {
            Intent intent = new Intent(this, Galeria_Activity.class);
            startActivity(intent);
        });
        rellay_mapas.setOnClickListener(view -> {
            Intent intent = new Intent(this, Mapas_Activity.class);
            startActivity(intent);
        });
        rellay_restaurantes.setOnClickListener(view -> {
            Intent intent = new Intent(this, Hoteles_Activity.class);
            startActivity(intent);
        });
        rellay_settings.setOnClickListener(view -> {
            Intent intent = new Intent(this, Settings_Activity.class);
            startActivity(intent);
        });
        rellay_musica.setOnClickListener(view ->{
            Intent intent = new Intent(this, Musica_Activity.class);
            startActivity(intent);
        });



    }
}