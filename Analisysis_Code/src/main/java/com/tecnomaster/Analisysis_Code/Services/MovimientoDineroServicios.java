package com.tecnomaster.Analisysis_Code.Services;


import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Repository.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;


@Service
public class MovimientoDineroServicios {

    //Instanciar Repositorio
    @Autowired
    MovimientoDineroRepository repository;

    //Servicio para consultar todos los movimientos de dinero por empresa
    public ArrayList<MovimientoDinero> buscarMovimientosDinero(String nombreEmpresa){
        return (ArrayList<MovimientoDinero>) repository.findByEmpresa(nombreEmpresa);
    }


    //   //Servicio para consultar 1 solo movimientos de dinero por ID
    public Optional<MovimientoDinero> consultaMovimientoDinero(int id){
        return repository.findById(id);
    }



    //Servicio para crear movimientos de dinero
    public String crearMovimientoDinero(MovimientoDinero newmd){
        repository.save(newmd);
        return "Movimiento Registrado Exitosamente";
    }


//    Servicio para actualizar movimiento de dinero

    public String actualizarMovimientoDinero(int id, Map<Object, Object> actuMD){
        if (consultaMovimientoDinero(id).isPresent()){
            MovimientoDinero md = repository.findById(id).get();
            actuMD.forEach((key, value)->{;
                Field campo= ReflectionUtils.findField(MovimientoDinero.class,(String) key);
                campo.setAccessible(true);
                ReflectionUtils.setField(campo, md, value);
            });
            repository.save(md);
            return "Movimiento Actualizado con Exito";
        }else {return "Movimiento de dinero no existe";}
    }

//    Servicio para eliminar movimiento de dinero

    public String eliminarMd(int id){
        if(consultaMovimientoDinero(id).isPresent()){
            repository.deleteById(id);
            return "Movimiento Eliminado Correctamente";
        }else{return "Movimiento de dinero no existe";}
    }

}
