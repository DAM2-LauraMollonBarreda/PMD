package com.lauramb.practica4_dashboard.Restaurantes.fragment;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.lauramb.practica4_dashboard.Restaurantes.model.Restaurante;
import com.lauramb.practica4_dashboard.databinding.FragmentRestauranteBinding;

import java.util.List;


public class MyRestauranteRecyclerViewAdapter extends RecyclerView.Adapter<MyRestauranteRecyclerViewAdapter.ViewHolder> {
    //1-Variables necesarias
    private  final  List<Restaurante> mValues;
    private Context ctx;

    //2-Crear el constructor de la variables anteriores
    public MyRestauranteRecyclerViewAdapter(List<Restaurante> mValues, Context ctx) {
        this.mValues = mValues;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentRestauranteBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));

    }

    //3-METODO IMPORTANTE: realiza el dibujado de la lista completa
    //Es lanzado tantas veces como elementos tenemos en las listas
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //4-Rescatamos los datos del elemento que ocupa la posicion "position"
        holder.mItem=mValues.get(position);
        holder.textViewNombreRestaurante.setText((mValues.get(position).getNombre()));
        holder.textViewDireccionRestaurante.setText((mValues.get(position).getDireccion()));
        holder.ratingBarValoracionRestaurante.setRating((mValues.get(position).getValoracion()));
        //4-Implementamos la carga de la imagen que ocupa el imageView
        Glide.with(ctx).load(mValues.get(position).getUrlFoto()).into(holder.imageViewFotoRestaurante);

    }


    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textViewNombreRestaurante;
        public final TextView textViewDireccionRestaurante;
        public final ImageView imageViewFotoRestaurante;
        public final RatingBar ratingBarValoracionRestaurante;
        public Restaurante mItem;


        public ViewHolder(FragmentRestauranteBinding binding) {
            super(binding.getRoot());
            //2-Vinculamos los elemtos
            textViewNombreRestaurante=binding.textViewNombre;
            textViewDireccionRestaurante=binding.textViewDireccion;
            imageViewFotoRestaurante=binding.imageViewRestaurante;
            ratingBarValoracionRestaurante=binding.ratingBarValoracion;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewNombreRestaurante.getText() + "'";
        }
    }
}