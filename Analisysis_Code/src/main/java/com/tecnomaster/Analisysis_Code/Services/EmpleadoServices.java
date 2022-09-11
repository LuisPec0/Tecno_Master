package com.tecnomaster.Analisysis_Code.Services;
import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Entities.Empresa;
import com.tecnomaster.Analisysis_Code.Repository.EmpleadoRepositorio;
import com.tecnomaster.Analisysis_Code.Repository.EmpresaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@Service
public class EmpleadoServices {
    private EmpleadoRepositorio repositorio;
    private EmpresaRepository empresaRepo;

    public EmpleadoServices(EmpleadoRepositorio repositorio, EmpresaRepository empresaRepo) {
        this.repositorio = repositorio;
        this.empresaRepo = empresaRepo;
    }
    public ArrayList<Empleado> ListarEmpleado()
    {
        return (ArrayList<Empleado>) repositorio.findAll();

    }

    public Optional<Empleado> buscarEmpleado(int id)
    {
        return  repositorio.findById(id);
    }

    public  ArrayList<Empleado> buscarNombreEmpleado(String nombreEmpleado)
    {
        //return  repositorio.findByNombre(nombre);
        return repositorio.findByNombreEmpleado(nombreEmpleado);
    }


    public Empleado agregarEmpleado(int nit,  Empleado empleado)
    {

        return empresaRepo.findById(nit).map(empresa ->{
            empleado.setEmpresa(empresa);
            return repositorio.save(empleado);
        }).get();


    }





    public Empleado actualizarCampoEmpleado(int id, Map<Object,Object> EmpleadoMap){
        Empleado empleado=repositorio.findById(id).get();

        EmpleadoMap.forEach((key,value)->{
            //ojo aqui cambie key string por int
            Field campo= ReflectionUtils.findField(Empleado.class, (String) key);
            campo.setAccessible(true);
            ReflectionUtils.setField(campo, empleado, value);
        });
        return repositorio.save(empleado);
    }




    public String eliminarEmpleado(int id)
    {
        if(buscarEmpleado(id).isPresent())
        {
            repositorio.deleteById(id);
            return "Empleado eliminada";
        }
        else
        {
            return "Empleado no eliminado";
        }

    }


}
