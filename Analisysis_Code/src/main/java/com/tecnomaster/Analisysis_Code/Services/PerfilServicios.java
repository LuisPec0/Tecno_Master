package com.tecnomaster.Analisysis_Code.Services;

import com.tecnomaster.Analisysis_Code.Entities.Perfil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PerfilServicios {

    public PerfilServicios() {
        this.datosPerfil();
        Perfil perfil1 = new Perfil(12345,"FotoPerfil","213098");
    }



    ArrayList<Perfil>listaPerfil = new ArrayList<Perfil>();
    private void datosPerfil() {
        listaPerfil.add(new Perfil(1234, "Foto", "324566" ));
        listaPerfil.add(new Perfil(234560,"Fotico","32456"));
        listaPerfil.add(new Perfil(2345609,"fotico","3421312"));

    }

    public ArrayList<Perfil> leerPerfil() {
        return leerPerfil();
    }

    public String agregarPerfil(Perfil perfil) {
        listaPerfil.add(perfil);
        return "Perfil agregado Exitosamente";
    }

    public String eliminarPerfil(int index) {
        listaPerfil.remove(index);
        return "Perfil eliminado Exitosamente";
    }
    public String actualizarPerfil(int index, Perfil newPerfil){
        listaPerfil.set(index, newPerfil);
        return "El Perfil fue actualizado Exitosamente";
    }
}

