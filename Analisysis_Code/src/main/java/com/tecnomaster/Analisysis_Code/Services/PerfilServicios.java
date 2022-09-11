package com.tecnomaster.Analisysis_Code.Services;

import com.tecnomaster.Analisysis_Code.Entities.Perfil;
import com.tecnomaster.Analisysis_Code.Repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PerfilServicios {

    private PerfilRepository repository;

    public PerfilServicios(PerfilRepository repository) {
        this.repository = repository;
    }

    //método que va mostrar todos los usuarios

    public ArrayList<Perfil> mostrarusuarios(){
        return (ArrayList<Perfil>) repository.findAll();
    }

    public Optional<Perfil> buscarUsuario(int Id){
        return repository.findById(Id);
    }

    public String AgregarUsuario(Perfil perfil){
        if(!(buscarUsuario(perfil.getId()).isPresent())){
            repository.save(perfil);
            return "El Usuario se agregró con Exito";
        }else{
            return "El Usuario ya se encuentra registrado";
        }
    }

    public String ActualizarUsuario(Perfil perfil){
        if (buscarUsuario(perfil.getId()).isPresent()){
            repository.save(perfil);
            return "El usuario fue actualizado con exito";
        }else{
            return "El Usuario que desea actualizar no se encuentra registrado";
        }
    }

    public String EliminarLibro(int Id){
        if(buscarUsuario(Id).isPresent()){
            repository.deleteById(Id);
            return "El Usuario se eliminó correctamente";
        }else {
            return "El Usuario a eliminar no se encuentra registrado";
        }
    }
}