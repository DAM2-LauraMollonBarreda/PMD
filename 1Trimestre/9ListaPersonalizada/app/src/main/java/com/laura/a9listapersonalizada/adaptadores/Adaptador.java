package com.laura.a9listapersonalizada.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.laura.a9listapersonalizada.R;
import com.laura.a9listapersonalizada.model.Entidad;

import java.util.ArrayList;
//4-Extendemos de baseAdapter y generamos los metodos que nos pide
public class Adaptador extends BaseAdapter {
    //1-Creamos el array lis de entidad que seran los datos que se mostraran en el list view
    private ArrayList<Entidad> listEntidad;

    //2-Creamos un contexto
    private Context context;
    private LayoutInflater inflater;

    //3-Generamos el constructor
    public Adaptador(ArrayList<Entidad> listEntidad, Context context) {
        this.listEntidad = listEntidad;
        this.context = context;
    }

    //Este metodo indicara al list view cuandos datos van a cargar
    @Override
    public int getCount() {
        return listEntidad.size();
    }

    //Este metodo devolvera la posicion
    @Override
    public Object getItem(int position) {
        return listEntidad.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //Aqui se creara cada item y se le asignara los valores
    // para cada elemento
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //Obtenemos el objeto por cada item a mostrar
        final Entidad entidad= (Entidad) getItem(position);
        //Creamos e inicializamos los elementos del item de las listas
        convertView=LayoutInflater.from(context).inflate(R.layout.item,null);
        ImageView imgFoto= convertView.findViewById(R.id.imgFoto);
        TextView tvTitulo = convertView.findViewById(R.id.tvTitulo);
        TextView tvContenido= convertView.findViewById(R.id.tvContenido);
        //Llenamos los elementos con los valores de cada Item
        imgFoto.setImageResource(entidad.getImgFoto());
        tvTitulo.setText(entidad.getTitulo());
        tvContenido.setText(entidad.getContenido());

        return convertView;
    }
}
