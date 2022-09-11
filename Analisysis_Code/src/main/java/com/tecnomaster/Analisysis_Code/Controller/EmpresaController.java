package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.Empresa;
import com.tecnomaster.Analisysis_Code.Services.EmpresaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EmpresaController {
    @Autowired
    private EmpresaServices services;

    public EmpresaController(EmpresaServices services) {
        this.services = services;
    }
    //Constructor

    //Get enterprises
    @GetMapping("/enterprises")
    public ArrayList<Empresa> list(){
        return services.listEnterprise();
    }

    //Get enterprises/id
    @GetMapping("/enterprises/{id}")
    public Optional<Empresa> buscarEmpresa(@PathVariable("id") int id){
        return services.buscarEmpresa(id);
    }

    //Post enterprises
    @PostMapping("/enterprises")
    public String createEnterprise(@RequestBody Empresa e){
        return services.createEnterprise(e);
    }

    //Patch enterprises/id
    @PatchMapping("/enterprises/{id}")
    public String actualizarEmpresa(@PathVariable("id") Integer index, @RequestBody Empresa e){
        return services.actualizarEmpresa(index,e);
    }

    //Del enterprises/id
    @DeleteMapping("/enterprises/{id}")
    public String eliminarEmpresa(@PathVariable("id") int id){
        return services.eliminarEmpresa(id);
    }





}
