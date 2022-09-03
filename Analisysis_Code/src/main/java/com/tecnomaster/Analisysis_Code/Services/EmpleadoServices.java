package com.tecnomaster.Analisysis_Code.Services;
import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Entities.Empresa;
//import jdk.internal.icu.text.UnicodeSet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpleadoServices {

    public EmpleadoServices() {
        this.datosEmpleado();
        Empresa emp1 = new Empresa("104542788", "Coca cola s.a", "Cr 20 30 44", "3205412");
    }

    //Array para simular base de datos

    Empresa emp1 = new Empresa("104542788", "Coca cola s.a", "Cr 20 30 44", "3205412");
    ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

    public void datosEmpleado() {
        listaEmpleado.add(new Empleado(3451144, "Jose Rudas", "rudaslio17@gmail.com", "ADMINISTRADOR", emp1));
        listaEmpleado.add(new Empleado(3451144, "tomas Rudas", "rudaslio17@gmail.com", "ADMINISTRADOR", emp1));
        listaEmpleado.add(new Empleado(3451144, "pepe Rudas", "rudaslio17@gmail.com", "ADMINISTRADOR", emp1));
    }


    //  servico para leer empleados
    public ArrayList<Empleado> leerEmpleados() {
        return listaEmpleado;
    }

    // Servicio para agregar empleado
    public String agregarEmpleado(Empleado empleado) {
        listaEmpleado.add(empleado);
        return "Empleado agregado Exitosamente";
    }

//   Servicio Eliminar Empleado

    public String eliminarEmpleado(int index) {
        listaEmpleado.remove(index);
        return "Empleado eliminado Exitosamente";
    }
    //    Servicio para consultar un empleado

    public Empleado consultarEmpleado(int index) {
        return listaEmpleado.get(index);
    }


//    Servicio Para actualizar empleado
    public String actualizarEmpleado(int index, Empleado newEmpleado){
        listaEmpleado.set(index, newEmpleado);
        return "actualizacion exitosa";
    }

}





