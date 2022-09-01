package com.tecnomaster.Analisysis_Code.Services;

import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Entities.Empresa;
import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;

import java.util.ArrayList;

public class MovimientoDineroServices {

    ArrayList<MovimientoDinero> lista  = new ArrayList<MovimientoDinero>();

    public MovimientoDineroServices() {
        this.datosiniciales();
    }

    public ArrayList<MovimientoDinero> getLista() {
        return lista;
    }

    public void datosiniciales(){
        Empresa miEmpresa = new Empresa("Tech Store", "Avenida 28", "3445676", "123456");

        Empleado empleado=new Empleado(3451144,"Jose Rudas","rudaslio17@gmail.com","ADMINISTRADOR", miEmpresa);

        Empleado Empleado;
        lista.add(new MovimientoDinero(250000,"consigncion", empleado));
        lista.add(new MovimientoDinero(300000,"Retiro",empleado));
        lista.add(new MovimientoDinero(100000,"consignacion", empleado));
    }

    public MovimientoDinero buscarMovimientoDinero(int index){
        return lista.get(index);
    }

    public String crearMovimientoDinero(MovimientoDinero md){
        lista.add(md);
        return "Movimiento Registrado Exitosamente";
    }

    public String actualizarMovimientoDinero(int index, MovimientoDinero md){
        lista.set(index, md);
        return "Movimiento Actualizado con Exito";
    }

    public String eliminarMovimientoDinero(int index){
        lista.remove(index);
        return "El Movimiento fue Eliminado con Exito";
    }
}
