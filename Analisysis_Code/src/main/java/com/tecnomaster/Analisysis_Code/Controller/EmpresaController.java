package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.Empresa;
import com.tecnomaster.Analisysis_Code.Services.EmpresaServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpresaController {
    EmpresaServices services;

    //Constructor
    public EmpresaController(){
        this.services = new EmpresaServices();
    }

    //Get enterprises
    @GetMapping("/enterprises")
    public ArrayList<Empresa> listEnterprise(){
        return this.services.getEnterprise();
    }

    //Post enterprises
    @PostMapping("/enterprises")
    public String createEnterprise(@RequestBody Empresa e){
        return this.services.createEnterprise(e);
    }

    //Get enterprises/id
    @GetMapping("/enterprises/{id}")
    public Empresa buscarEmpresa(@PathVariable("id") Integer index){
        return this.services.buscarEmpresa(index);
    }

    //Patch enterprises/id
    @PatchMapping("/enterprises/{id}")
    public String actualizarEmpresa(@PathVariable("id") Integer index, @RequestBody Empresa e){
        return this.services.actualizarEmpresa(index,e);
    }

    //Del enterprises/id
    @DeleteMapping("/enterprises/{id}")
    public String eliminarEmpresa(@PathVariable("id") Integer index){
        return this.services.eliminarEmpresa(index);
    }
}
