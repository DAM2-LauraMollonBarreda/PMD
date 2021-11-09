package com.lauramb.practica4_dashboard.Restaurantes.fragment;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lauramb.practica4_dashboard.Restaurantes.fragment.placeholder.PlaceholderContent.PlaceholderItem;
import com.lauramb.practica4_dashboard.Restaurantes.fragment.databinding.FragmentRestauranteBinding;
import com.lauramb.practica4_dashboard.Restaurantes.model.Restaurante;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
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

        return new ViewHolder(FragmentRestauranteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    //3-METODO IMPORTANTE: realiza el dibujado de la lista completa
    //Es lanzado tantas veces como elementos tenemos en las listas
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //4-Rescatamos los datos del elemento que ocupa la posicion "position"
        holder.mItem=mValues.get(position);
        holder.text

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentRestauranteBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}