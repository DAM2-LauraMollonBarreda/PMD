package com.lauramb.practica4_dashboard.Musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.lauramb.practica4_dashboard.Musica.Adaptador.Adaptador;
import com.lauramb.practica4_dashboard.Musica.model.Disco;
import com.lauramb.practica4_dashboard.R;

import java.util.ArrayList;

public class Musica_Activity extends AppCompatActivity {

    //1-Declaro los elementos del layout
    private ListView lstDiscos;
    //3-Declaro las demas variables que necesito en el programa
    private Adaptador adaptador;
    private ArrayList<Disco> arrayEntidad = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);


        //2-Uno los elementos del layout con la actividad
        lstDiscos=findViewById(R.id.lstDiscos);

        //5-Llamo la metodo
        llenarItems();


    }

    private void llenarItems() {

        arrayEntidad.add(new Disco(R.drawable.sinnoticiasdeholanda_musica,"Sin Noticias De Holanda","Albúm Melendi · 2003"));
        arrayEntidad.add(new Disco(R.drawable.animales_musica,"Animales","Albúm de Pereza · 2005"));
        arrayEntidad.add(new Disco(R.drawable.entrepoetas_musica,"Entre Poetas y Presos","Albúm de La Raiz · 2016"));
        arrayEntidad.add(new Disco(R.drawable.porlabocaviveelpez_musica,"Por La Boca Vive El Pez","Albúm de Fito & Fitipaldis · 2006"));
        arrayEntidad.add(new Disco(R.drawable.estopa_musica,"Estopa","Albúm de Estopa · 1999"));
        arrayEntidad.add(new Disco(R.drawable.oncerazones_musica,"11 razones","Albúm de Aitana · 2020"));





        adaptador = new Adaptador(arrayEntidad,this);
        lstDiscos.setAdapter(adaptador);
    }
}