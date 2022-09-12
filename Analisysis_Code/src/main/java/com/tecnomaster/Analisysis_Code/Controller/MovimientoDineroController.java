package com.tecnomaster.Analisysis_Code.Controller;


import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Services.MovimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class MovimientoDineroController {
    @Autowired
    MovimientoDineroServicios movimientoDineroServicio;


    //Listar movimientos -- No funciona
    @GetMapping("/enterprises/{id}/movements")
    public ArrayList<MovimientoDinero> ConsultarMovimiento(@PathVariable("id") int idEmpresa){
        return this.movimientoDineroServicio.buscarMovimientosDinero(idEmpresa);
    }

//    Consultar 1 movimiento de Dinero por ID -- Revisar sieste Get lo dejamos dado que no nos lo están pidiendo.

    @GetMapping("/movements/{id}")
    public MovimientoDinero cunsultarMovimiento(@PathVariable("id") int id){
        return this.movimientoDineroServicio.consultaMovimientoDineroID(id);
    }


    //    Crear Movimiento de Dinero -- funciona correctmente al crear el movimineto - pero no muestra el usuario que lo hizo
    @PostMapping("/enterprises/{id}/movements")
    public  MovimientoDinero crearMovimientoDinero (@PathVariable("id") int id, @RequestBody MovimientoDinero movimiento){
        return movimientoDineroServicio.crearMovimientoDinero(movimiento);
    }


    //    Actualizar Movimiento de Dinero *Toca Revisar la ruta no es la misma que piden en el pdf* -- No funciona no actualiza
    @PatchMapping("/movements/{id}")
    public MovimientoDinero actualizar(@PathVariable("id") int idMd, @RequestBody MovimientoDinero mDinero){
        MovimientoDinero mov=movimientoDineroServicio.consultaMovimientoDineroID(idMd);
        mov.setConcepto(mov.getConcepto());
        mov.setMonto(mov.getMonto());
        mov.setUsuario(mov.getUsuario());
        return movimientoDineroServicio.crearMovimientoDinero(mov);

    }

    //    Eliminar Movimiento de dinero *Toca Revisar la ruta no es la misma que piden en el pdf* -- Funciona Correctamente
    @DeleteMapping("/movements/{id}")
    public String eliminarMovimientoDinero (@PathVariable("id") Integer index){
        return this.movimientoDineroServicio.eliminarMd(index);
    }

}
