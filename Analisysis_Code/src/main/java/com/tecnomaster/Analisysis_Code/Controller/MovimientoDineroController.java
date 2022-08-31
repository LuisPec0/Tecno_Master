package com.tecnomaster.Analisysis_Code.Controller;


import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Services.MovimientoDineroServicios;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MovimientoDineroController {

    MovimientoDineroServicios services;

    public MovimientoDineroController(){
        this.services = new MovimientoDineroServicios();
    }

    @GetMapping("/enterprises/{id}/movements")

    public MovimientoDinero ConsultarMovimiento (@PathVariable("id") Integer index){
        return this.services.buscarMovimientoDinero(index);
    }

    @PostMapping("/enterprises/{id}/movements")

    public  String crearMovimientoDinero (@RequestBody MovimientoDinero md){
        return this.services.crearMovimientoDinero(md);
    }

    @DeleteMapping("/enterprises/{id}/movements")

    public String eliminarMovimientoDinero (@PathVariable("id") Integer index){
        return this.services.eliminarMovimientoDinero(index);
    }

}
