package com.example.didact.u2_listviewpropio;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class Personaje {

    String nombre;
    String origen;
    String imagen;
    String ano;
    String frase;

    public Personaje(String nombre, String origen, String imagen, String ano, String frase) {
        this.nombre = nombre;
        this.origen = origen;
        this.imagen = imagen;
        this.ano = ano;
        this.frase = frase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
