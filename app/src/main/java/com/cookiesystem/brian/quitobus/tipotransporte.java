package com.cookiesystem.brian.quitobus;

/**
 * Created by Brian on 19/06/2016.
 */
public class tipotransporte {
    private  int id;
    private String nombre;

    public  tipotransporte(int id, String nombre){
        this.id = id;
        this.nombre=nombre;
    }
//recuperar y establecer el id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//recuperar y establecer Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
