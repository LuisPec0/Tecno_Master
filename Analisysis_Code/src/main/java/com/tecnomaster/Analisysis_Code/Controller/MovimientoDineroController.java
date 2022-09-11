package com.tecnomaster.Analisysis_Code.Controller;


import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Services.MovimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
public class MovimientoDineroController {
    @Autowired
    MovimientoDineroServicios services;

    @GetMapping("/enterprises/{id}/movements")
    public ArrayList<MovimientoDinero> ConsultarMovimiento(@PathVariable("id") int idEmpresa){
        return this.services.buscarMovimientosDinero(idEmpresa);
    }

//    Consultar 1 movimiento de Dinero

    @GetMapping("/movements/{id}")
    public Optional<MovimientoDinero> cunsultarMovimiento(@PathVariable("id") int id){
        return this.services.consultaMovimientoDinero(id);
    }


    //    Crear Movimiento de Dinero
    @PostMapping("/enterprises/{id}/movements")
    public  String crearMovimientoDinero (@RequestBody MovimientoDinero md){
        return this.services.crearMovimientoDinero(md);
    }


    //    Actualizar Movimiento de Dinero
    @PatchMapping("/movements/{id}")
    public String actualizar(@PathVariable("id") int idMd, @RequestBody Map<Object, Object> mDinero){
        return this.services.actualizarMovimientoDinero(idMd, mDinero);

    }


    //    Eliminar Movimiento de dinero
    @DeleteMapping("/movements/{id}")

    public String eliminarMovimientoDinero (@PathVariable("id") Integer index){
        return this.services.eliminarMd(index);
    }

}
