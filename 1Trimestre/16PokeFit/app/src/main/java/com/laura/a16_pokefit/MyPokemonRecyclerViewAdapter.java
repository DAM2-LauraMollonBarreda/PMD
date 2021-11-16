package com.laura.a16_pokefit;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.laura.a16_pokefit.databinding.FragmentPokemonBinding;
import com.laura.a16_pokefit.model.Pokemon;

import java.util.List;


public class MyPokemonRecyclerViewAdapter extends RecyclerView.Adapter<MyPokemonRecyclerViewAdapter.ViewHolder> {

    private final List<Pokemon> mValues;
    private Context context;

    public MyPokemonRecyclerViewAdapter(List<Pokemon> mValues, Context context) {
        this.mValues = mValues;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentPokemonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombrePokemon.setText(mValues.get(position).getName());
        //usaremos glide para cargar cada imagen
        Glide.with(context)
                .load("https://raw.githbusercontent.com/pokeapi/sprites/master/sprites/pokemon/"+mValues.get(position).getNumber()+".png")
                .into(holder.imagenPokemon);


    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView imagenPokemon;
        public final TextView nombrePokemon;
        public Pokemon mItem;

        public ViewHolder(FragmentPokemonBinding binding) {
            super(binding.getRoot());
            imagenPokemon = binding.fotoImageView;
            nombrePokemon = binding.nombreTextView;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + nombrePokemon.getText() + "'";
        }
    }
}