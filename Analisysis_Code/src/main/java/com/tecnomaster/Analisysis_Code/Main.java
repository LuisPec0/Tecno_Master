package com.tecnomaster.Analisysis_Code;

import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import com.tecnomaster.Analisysis_Code.Entities.Empresa;
import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;

public class Main {


    public static void main(String[] args) {
        //Pruebas Clase Empresa
        //Instanciar Clase Empresa
        Empresa miEmpresa = new Empresa("Tech Store", "Avenida 28", "3445676", "123456");

        //Leer y modificar el nombre de la empresa
        System.out.println("Lectura nombre empresa: "+miEmpresa.getNombre());
        miEmpresa.setNombre("Tech Store Team");
        System.out.println("Cambio nombre empresa: "+miEmpresa.getNombre());
        System.out.println("_____________________");

        //Leer y modificar la dirección de la empresa
        System.out.println("Lectura direccion empresa: "+miEmpresa.getDireccion());
        miEmpresa.setDireccion("Nueva Direccion");
        System.out.println("Cambio direccion empresa: "+miEmpresa.getDireccion());
        System.out.println("_____________________");

        //Leer y modificar el teléfono de la empresa
        System.out.println("Lectura teléfono empresa: "+miEmpresa.getTelefono());
        miEmpresa.setTelefono("98765");
        System.out.println("Cambio teléfono empresa: "+miEmpresa.getTelefono());
        System.out.println("_____________________");

        //Leer y modificar el NIT de la empresa
        System.out.println("Lectura NIT empresa: "+miEmpresa.getNit());
        miEmpresa.setNit("898989");
        System.out.println("Cambio NIT empresa: "+miEmpresa.getNit());
        System.out.println("_____________________");

        //-----------------------------------------------------------------------------------------------------

        //Pruebas Clase Empleado
        Empresa emp1=new Empresa("104542788","Coca cola s.a","Cr 20 30 44","3205412");
        System.out.println("La empresa creada es:"+emp1.getNombre());
        //Instanciar Clase Empleado
        Empleado empleado=new Empleado(3451144,"Jose Rudas","rudaslio17@gmail.com","ADMINISTRADOR",emp1);

        //Leer y modificar el nombre de un empleado
        System.out.println("El nombre del empleado es: "+empleado.getNombreEmpleado());
        empleado.setNombreEmpleado("Juan Carlos");
        System.out.println("Cambio nombre empleado: "+empleado.getNombreEmpleado());

        //Leer y modificar el correo de un empleado
        System.out.println("El correo del empleado es: "+empleado.getCorreo());
        empleado.setCorreo("jcarlos@gmail.com");
        System.out.println("Cambio correo empleado: "+empleado.getCorreo());

        //Leer y modificar la empresa a la que el empleado pertenece
        empleado.CambiarNombreEmpresa("Bavaria");
        System.out.println("El nuevo nombre de la empresa es:"+empleado.getEmpresa());
        System.out.println(emp1.getNombre());

        //Leer y modificar el rol del empleado
        System.out.println("El rol del empleado es: "+empleado.getRole());
        empleado.setRole("operativo8798");
        System.out.println("El nuevo rol del empleado es: "+empleado.getRole());

        //-------------------------------------------------------------------------------------------------------------------

        //Pruebas Clase MovimientoDinero
        //Instanciar Clase MovimientoDinero
        MovimientoDinero din1 = new MovimientoDinero(10000, "consignacion", empleado);

        //Leer y modificar el Monto del Movimiento
        System.out.println("El monto del movimiento es de: "+din1.getMonto());
        din1.setMonto(15000);
        System.out.println("El nuevo monto es de : "+din1.getMonto());

        //Es posible crear montos positivos y negativos
        System.out.println("Monto Actual: "+din1.getMonto());
        din1.agregarMonto(-90);
        System.out.println("Monto Actual: "+din1.getMonto());
        din1.agregarMonto(1000);
        System.out.println("Monto Actual: "+din1.getMonto());

        //Leer y modificar el concepto del Movimiento
        System.out.println("El tipo de movimiento es: "+din1.getConceptoMovimiento());
        din1.setConceptoMovimiento("Retiro");
        System.out.println("El nuevo movimiento es: "+din1.getConceptoMovimiento());

        //Definir qué usuario fue encargado de registrar el movimiento
        System.out.println("El usuario encargado del movimiento fue: "+empleado.getNombreEmpleado());

        //Rol del usuario encargado del movimiento
        System.out.println("El rol del usuario encargado del movimiento fue: "+empleado.getRole());













    }
}
