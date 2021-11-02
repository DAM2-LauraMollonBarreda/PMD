package com.laura.a10pokemonapp.model;



public class Pokemon {
    private String id;
    private String nombre;
    //Le ponog un entero por que contiene el id de la imagen a mostrar
    //private int imagen;
    private String imageUrl;
    private int soundId;
    private Type type;

    public enum Type{
        FIRE, WATER, PLANT, ELECTRIC
    }

    public Pokemon(String id, String nombre, String imageUrl, int soundId, Type type) {
        this.id = id;
        this.nombre = nombre;
        this.imageUrl = imageUrl;
        this.soundId = soundId;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    //public int getImagen() {return imagen;}


    public String getImageUrl() {
        return imageUrl;
    }

    public int getSoundId() {
        return soundId;
    }

    public Type getType() {
        return type;
    }
}
