package com.tecnomaster.Analisysis_Code.Controller;


import com.tecnomaster.Analisysis_Code.Entities.Perfil;
import com.tecnomaster.Analisysis_Code.Services.PerfilServicios;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
public class PerfilController {

    private PerfilServicios servicios;

    public PerfilController(PerfilServicios servicios) {
        this.servicios = servicios;
    }

    @GetMapping("/MostrarUsuarios")
    public ArrayList<Perfil>listar(){
        return servicios.mostrarusuarios();
    }

    @GetMapping("/MostrarUsuarios/{Id}")
    public Optional<Perfil> buscarUsuarios(@PathVariable("Id")int Id){
        return servicios.buscarUsuario(Id);
    }

    @PostMapping("/AgregarUsuario")
    public String agregarUsuario(@RequestBody Perfil perfil){
        return servicios.AgregarUsuario(perfil);
    }

    @DeleteMapping("/eliminarUsuario/{Id}")
    public String EliminarUsuario(@PathVariable("Id") int Id){
        return servicios.EliminarLibro(Id);
    }
}



