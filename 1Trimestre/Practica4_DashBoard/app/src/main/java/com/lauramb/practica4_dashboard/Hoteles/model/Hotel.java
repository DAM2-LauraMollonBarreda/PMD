package com.lauramb.practica4_dashboard.Hoteles.model;

public class Restaurante {
    //Datos que tiene un restaurante
    private String nombre;
    private String urlFoto;
    private Float valoracion;
    private String direccion;

    //Creamos el constructor
    public Restaurante(String nombre, String urlFoto, Float valoracion, String direccion) {
        this.nombre = nombre;
        this.urlFoto = urlFoto;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    //Creamos los getters y los seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
