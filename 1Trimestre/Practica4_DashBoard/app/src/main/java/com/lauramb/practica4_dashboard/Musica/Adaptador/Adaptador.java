package com.lauramb.practica4_dashboard.Musica.Adaptador;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lauramb.practica4_dashboard.Musica.DetalleActivity_Musica;
import com.lauramb.practica4_dashboard.Musica.model.Disco;
import com.lauramb.practica4_dashboard.R;

import java.util.ArrayList;

//1-Creamos una clase y le añadimos el extends
//en ese momento aparece un error y es que tenermos que implemetar los metodos
public class Adaptador extends BaseAdapter {
    // 1 - Creamos el arraylist de Entidad que serán los datos que
    //mostrará el ListView
    private ArrayList<Disco> listDisco;
    // 2 - Creamos un contexto
    private Context context;
    private LayoutInflater inflater;

    // 3 - Generamos el constructor
    public Adaptador(ArrayList<Disco> listDisco, Context context) {
        this.listDisco = listDisco;
        this.context = context;
    }

    // Este metodo indicará al ListView cuantos datos o numero de objetos se van a cargar (el tamaño)
    @Override
    public int getCount() {
        return listDisco.size();
    }

    // Este metodo devolverá la posicion
    @Override
    public Object getItem(int position) {
        return listDisco.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // Aquí se creará cada item y se le asignará los valores
    //para cada elemento de cada item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtenemos el objeto por cada Item a mostrar
        final Disco disco = (Disco) getItem(position);

        // Creamos e inicializamos los elementos del item de la lista
        convertView = LayoutInflater.from(context).inflate(R.layout.item_musica, null);
        ImageView imgFoto = convertView.findViewById(R.id.imgFoto);
        TextView tvTitulo = convertView.findViewById(R.id.tvTitulo);
        TextView tvContenido = convertView.findViewById(R.id.tvContenido);

        // LLenamos los elemntos con los valores de cada Item
        imgFoto.setImageResource(disco.getImagen());
        tvTitulo.setText(disco.getTitulo());
        tvContenido.setText(disco.getAutor());

        // Gestionamos el evento click de la FORMA B
        convertView.setOnClickListener( v -> {

            Intent i = new Intent(context, DetalleActivity_Musica.class);
            i.putExtra("item", disco);
            context.startActivity(i);

        });





        return convertView;
    }
}
