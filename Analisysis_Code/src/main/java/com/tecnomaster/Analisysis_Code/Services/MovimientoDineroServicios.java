package com.tecnomaster.Analisysis_Code.Services;


import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Repository.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;



@Service
public class MovimientoDineroServicios {

    //Instanciar Repositorio
    @Autowired
    MovimientoDineroRepository movimientoDineroRepository;



    //Servicio para consultar todos los movimientos de dinero por empresa
    public ArrayList<MovimientoDinero> buscarMovimientosDinero(int idEmpresa){
        return (ArrayList<MovimientoDinero>) movimientoDineroRepository.findByEmpresa(idEmpresa);
    }


    //   //Servicio para consultar 1 solo movimientos de dinero por ID
    public MovimientoDinero consultaMovimientoDineroID(int id){
        return movimientoDineroRepository.findById(id).get();
    }



    //Servicio para crear movimientos de dinero
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero newmd){
        MovimientoDinero nmd=movimientoDineroRepository.save(newmd);
        return nmd;
    }


//    Servicio para actualizar movimiento de dinero

    public String actualizarMovimientoDinero(int id, Map<Object, Object> actuMD){
        if (movimientoDineroRepository.findById(id).isPresent()){
            MovimientoDinero md = movimientoDineroRepository.findById(id).get();
            actuMD.forEach((key, value)->{
                Field campo= ReflectionUtils.findField(MovimientoDinero.class,(String) key);
                campo.setAccessible(true);
                ReflectionUtils.setField(campo, md, value);
            });
            movimientoDineroRepository.save(md);
            return "Movimiento Actualizado con Exito";
        }else {return "Movimiento de dinero no existe";}
    }

//    Servicio para eliminar movimiento de dinero

    public String eliminarMd(int id){
        if(movimientoDineroRepository.findById(id).isPresent()){
            movimientoDineroRepository.deleteById(id);
            return "Movimiento Eliminado Correctamente";
        }else{return "Movimiento de dinero no existe";}
    }

}
