package com.lauramb.practica4_dashboard.Musica.model;

import java.io.Serializable;

public class Disco implements Serializable {
    public int imagen;
    public String titulo;
    public String autor;

    public Disco(int imagen, String titulo, String autor) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
