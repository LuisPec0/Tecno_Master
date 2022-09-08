package com.tecnomaster.Analisysis_Code.Entities;

import java.util.Calendar;
import java.util.Date;

//Revisar esta clase que servirá en el Front para la de registrar usuario

public class Perfil {

    private  int id;
    private String imagen;
    private String telefono;
    // el user user

    public Perfil() {
    }

    public Perfil(int id, String imagen, String telefono) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefon() {
        return telefono;
    }

    public void setTelefon(String telefon) {
        this.telefono = telefon;
    }


    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
