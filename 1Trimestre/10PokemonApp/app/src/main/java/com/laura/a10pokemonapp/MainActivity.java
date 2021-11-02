package com.laura.a10pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.laura.a10pokemonapp.adapter.PokemonListAdapter;
import com.laura.a10pokemonapp.fragments.DetailFragment;
import com.laura.a10pokemonapp.interfaces.iComunicaFragments;
import com.laura.a10pokemonapp.model.Pokemon;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements iComunicaFragments {
    DetailFragment detalleFragmentPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarPokemon(Pokemon pokemon) {
        //Esta interfaz sirve como puente para comunicar los fragments
        //Toast.makeText(this, pokemon.getNombre(),Toast.LENGTH_SHORT).show();

        //Aqui realizaremos toda la logica necesaria para poder  hacer el envio
        detalleFragmentPokemon= (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.pokemon_detail_fragment);
        detalleFragmentPokemon.setPokemonImage(pokemon.getImageUrl());
        detalleFragmentPokemon.playPokemonSound(pokemon.getSoundId());
    }
}