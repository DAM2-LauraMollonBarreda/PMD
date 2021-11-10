package com.lauramb.practica4_dashboard.Hoteles.model;

public class Hotel {
    //Datos que tiene un Hotel
    private String nombre;
    private String urlFotoHotel;
    private Float valoracion;
    private String direccion;
    private String urlFotoComarca;

    //Creamos el constructor
    public Hotel(String nombre, String urlFotoHotel, Float valoracion, String direccion, String urlFotoComarca) {
        this.nombre = nombre;
        this.urlFotoHotel = urlFotoHotel;
        this.valoracion = valoracion;
        this.direccion = direccion;
        this.urlFotoComarca = urlFotoComarca;
    }

    //Creamos los getters y los seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getUrlFotoHotel() {
        return urlFotoHotel;
    }

    public void setUrlFotoHotel(String urlFotoHotel) {
        this.urlFotoHotel = urlFotoHotel;
    }

    public String getUrlFotoComarca() {
        return urlFotoComarca;
    }

    public void setUrlFotoComarca(String urlFotoComarca) {
        this.urlFotoComarca = urlFotoComarca;
    }
}
