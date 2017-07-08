package com.example.robertocruzleija.miprimerapp.objectos;

import java.io.Serializable;

/**
 * Created by Roberto Cruz Leija on 01/07/2017.
 */

public class Ubicacion implements Serializable {

    private String nombre;
    private double longitud;
    private double latitud;

    public Ubicacion(String nombre, double longitud, double latitud) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
