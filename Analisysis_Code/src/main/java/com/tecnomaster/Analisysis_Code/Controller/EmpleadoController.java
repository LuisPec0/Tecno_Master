package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Services.EmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmpleadoController
{
    EmpleadoServices servicio;

    public EmpleadoController(EmpleadoServices servicio) {
        this.servicio = servicio;
    }
    //Listar
    @GetMapping("users")
    public ArrayList<Empleado> listar()
    {
        return servicio.ListarEmpleado();
    }

    @GetMapping("users/{id}")
    public Optional<Empleado> buscarEmpleado(@PathVariable("id") int id)
    {
        return servicio.buscarEmpleado(id);
    }
    @GetMapping("/BuscarNombreEmpleado/{nombreEmpleado}")
    public ArrayList<Empleado>  buscarNombreEmpleado(@PathVariable("nombreEmpleado") String nombreEmpleado )
    {
        return servicio.buscarNombreEmpleado(nombreEmpleado);

    }


    //Agregar
    @PostMapping("/users/{nit}")
    public Empleado agregarEmpleado(@PathVariable("nit") int nit, @RequestBody Empleado empleado){
        return servicio.agregarEmpleado(nit,empleado);
    }



    @PatchMapping("/users/{id}")
    public Empleado actualizarCampoEmpleado(@PathVariable("id") int id, @RequestBody Map<Object,Object> EmpleadoMap)
    {
        return servicio.actualizarCampoEmpleado(id,EmpleadoMap);
    }





    @DeleteMapping("/users/{id}")
    public String eliminarEmpleado(@PathVariable("id") int id)
    {
        return servicio.eliminarEmpleado(id);

    }




}
