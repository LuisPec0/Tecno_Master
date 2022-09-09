package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.Perfil;
import com.tecnomaster.Analisysis_Code.Services.PerfilServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PerfilController {

    private PerfilServices services;

    public PerfilController(PerfilServices services) {
        this.services = services;
    }

    @GetMapping("/users")
    public ArrayList<Perfil> usuarios(){
        return services.mostrarUsuarios();
    }

}
