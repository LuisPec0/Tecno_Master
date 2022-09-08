package com.tecnomaster.Analisysis_Code.Controller;



import com.tecnomaster.Analisysis_Code.Entities.Perfil;
import com.tecnomaster.Analisysis_Code.Services.PerfilServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PerfilController {

    @Autowired
    PerfilServicios services;


    public PerfilController(){
        this.services = new PerfilServicios();
    }

@GetMapping("/perfil")
    public ArrayList<Perfil> leerPerfil(){
        return this.services.leerPerfil();
    }

    @PostMapping("/perfil")
    public String agregarPerfil(@RequestBody Perfil p){
        return this.services.agregarPerfil(p);
    }

    @DeleteMapping("/perfil/{id}")
    public String eliminarPerfil(@PathVariable("id") Integer index ){
        return this.services.eliminarPerfil(index);
    }

    @PatchMapping("/perfil/{id}")
    public String actualizarPerfil(@PathVariable("id") Integer index, @RequestBody Perfil newPerfil){
        return  this.services.actualizarPerfil(index,newPerfil);
    }

}
