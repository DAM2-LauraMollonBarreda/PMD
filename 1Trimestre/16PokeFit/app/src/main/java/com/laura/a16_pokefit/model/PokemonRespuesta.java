package com.laura.a16_pokefit.model;

import java.util.ArrayList;

public class PokemonRespuesta {
    //Solo nos interesa el array de resultados que contiene el json de informacion

    private ArrayList<Pokemon> results;



    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
