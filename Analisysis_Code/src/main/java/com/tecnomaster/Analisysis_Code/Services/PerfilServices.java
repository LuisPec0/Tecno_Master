package com.tecnomaster.Analisysis_Code.Services;



import com.tecnomaster.Analisysis_Code.Entities.Perfil;
import com.tecnomaster.Analisysis_Code.Repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PerfilServices {

    private PerfilRepository repository;

    public PerfilServices(PerfilRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Perfil> mostrarUsuarios(){
        return (ArrayList<Perfil>) repository.findAll();
    }


}
