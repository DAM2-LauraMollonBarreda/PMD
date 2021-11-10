package com.lauramb.practica4_dashboard.Hoteles.fragment;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.lauramb.practica4_dashboard.Hoteles.model.Hotel;
import com.lauramb.practica4_dashboard.databinding.FragmentHotelBinding;

import java.util.List;


public class MyHotelRecyclerViewAdapter extends RecyclerView.Adapter<MyHotelRecyclerViewAdapter.ViewHolder> {
    //1-Variables necesarias
    private  final  List<Hotel> mValues;
    private Context ctx;

    //2-Crear el constructor de la variables anteriores
    public MyHotelRecyclerViewAdapter(List<Hotel> mValues, Context ctx) {
        this.mValues = mValues;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentHotelBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));

    }

    //3-METODO IMPORTANTE: realiza el dibujado de la lista completa
    //Es lanzado tantas veces como elementos tenemos en las listas
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //4-Rescatamos los datos del elemento que ocupa la posicion "position"
        holder.mItem=mValues.get(position);
        holder.textViewNombreHotel.setText((mValues.get(position).getNombre()));
        holder.textViewDireccionHotel.setText((mValues.get(position).getDireccion()));
        holder.ratingBarValoracionHotel.setRating((mValues.get(position).getValoracion()));
        //4-Implementamos la carga de la imagen que ocupa el imageView
        Glide.with(ctx).load(mValues.get(position).getUrlFotoHotel()).into(holder.imageViewFotoHotel);
        Glide.with(ctx).load(mValues.get(position).getUrlFotoComarca()).into(holder.imageViewFotoComarca);

    }


    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textViewNombreHotel;
        public final TextView textViewDireccionHotel;
        public final ImageView imageViewFotoHotel;
        public final RatingBar ratingBarValoracionHotel;
        public final ImageView imageViewFotoComarca;
        public Hotel mItem;


        public ViewHolder(FragmentHotelBinding binding) {
            super(binding.getRoot());
            //2-Vinculamos los elemtos
            textViewNombreHotel=binding.textViewNombre;
            textViewDireccionHotel=binding.textViewDireccion;
            imageViewFotoHotel=binding.imageViewRestaurante;
            imageViewFotoComarca=binding.imageViewComarca;
            ratingBarValoracionHotel=binding.ratingBarValoracion;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewNombreHotel.getText() + "'";
        }
    }
}