package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Services.EmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpleadoController {
    @Autowired
    EmpleadoServices servicio;

    public EmpleadoController(){
        this.servicio = new EmpleadoServices();
    }

    //Metodo GET Que Devuelve todos los empleados
    @GetMapping("/users")
    public ArrayList<Empleado> leerEmleados(){
        return this.servicio.leerEmpleados();
    }

    //    Metodo POST Para Agregar Empleados
    @PostMapping("/prueba")
    public String agregarEmpleado(@RequestBody Empleado x){
        return this.servicio.agregarEmpleado(x);
    }

//    Metodo DELETE para eliminar empleado

    @DeleteMapping("/user/{id}")
    public String eliminarEmpleado(@PathVariable("id") Integer index){
        return this.servicio.eliminarEmpleado(index);
    }

//    Metodo PATCH para Actualizar empleado
      @PatchMapping("/user/{id}")
      public String actualizarEmpleado(@PathVariable("id") Integer index, @RequestBody Empleado newEmpleado){
        return this.servicio.actualizarEmpleado(index,newEmpleado);
      }


//    Metod0 GET para consultar un solo empledo
     @GetMapping("/user/{id}")
    public Empleado mostrarEmpleado(@PathVariable("id") Integer index){
        return this.servicio.consultarEmpleado(index);
      }


}



