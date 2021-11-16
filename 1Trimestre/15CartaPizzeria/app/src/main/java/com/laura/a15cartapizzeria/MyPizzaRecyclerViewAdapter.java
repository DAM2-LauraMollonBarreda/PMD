package com.laura.a15cartapizzeria;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.laura.a15cartapizzeria.databinding.FragmentPizzaBinding;

import java.util.List;

public class MyPizzaRecyclerViewAdapter extends RecyclerView.Adapter<MyPizzaRecyclerViewAdapter.ViewHolder> {

    private final List<Pizza> mValues;
    private Context ctx;

    public MyPizzaRecyclerViewAdapter(List<Pizza> items, Context context) {
        mValues = items;
        ctx=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentPizzaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.tvNombrePizza.setText(holder.mItem.getName());
        holder.tvDescripcionPizza.setText(holder.mItem.getDescription());
        //Asignar la imagen al image view
        //Necesitare usar la libreria glide
       Glide.with(ctx)
               .load(holder.mItem.getImage())
               .into(holder.ivImagenPizza);

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView tvNombrePizza;
        public final TextView tvDescripcionPizza;
        public final ImageView ivImagenPizza;
        public Pizza mItem;

        public ViewHolder(FragmentPizzaBinding binding) {
            super(binding.getRoot());
            tvNombrePizza=binding.tvNombrePizza;
            tvDescripcionPizza=binding.tvDescripcion;
            ivImagenPizza=binding.ivPizzaImagen;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + tvNombrePizza.getText() + "'";
        }
    }
}