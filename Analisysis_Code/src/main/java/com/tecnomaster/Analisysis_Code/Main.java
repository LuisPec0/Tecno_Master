package com.tecnomaster.Analisysis_Code;

public class Main {


    public static void main(String[] args) {
        //Pruebas Clase com.tecnomaster.Analisysis_Code.Empresa
        Empresa miEmpresa = new Empresa("Tech Store", "Avenida 28", "3445676", "123456");

        System.out.println("Lectura nombre empresa: "+miEmpresa.getNombre());
        miEmpresa.setNombre("Tech Store Team");
        System.out.println("Cambio nombre empresa: "+miEmpresa.getNombre());
        System.out.println("_____________________");

        System.out.println("Lectura direccion empresa: "+miEmpresa.getDireccion());
        miEmpresa.setDireccion("Nueva Direccion");
        System.out.println("Cambio direccion empresa: "+miEmpresa.getDireccion());
        System.out.println("_____________________");


        System.out.println("Lectura telefono empresa: "+miEmpresa.getTelefono());
        miEmpresa.setTelefono("98765");
        System.out.println("Cambio telefono empresa: "+miEmpresa.getTelefono());
        System.out.println("_____________________");

        System.out.println("Lectura nit empresa: "+miEmpresa.getNit());
        miEmpresa.setNit("898989");
        System.out.println("Cambio nit empresa: "+miEmpresa.getNit());
        System.out.println("_____________________");

        //-----------------------------------------------------------------------------------------------------

        //Pruebas Clase com.tecnomaster.Analisysis_Code.Empleado
        Empresa emp1=new Empresa("104542788","Coca cola s.a","Cr 20 30 44","3205412");
        System.out.println("La empresa creada es:"+emp1.getNombre());
        Empleado empleado=new Empleado(3451144,"Jose Rudas","rudaslio17@gmail.com","ADMINISTRADOR",emp1) ;
        empleado.CambiarNombreEmpresa("Bavaria");
        System.out.println("El nuevo nombre de la empresa es:"+empleado.getEmpresa());
        System.out.println(emp1.getNombre());
        empleado.setRole("operativo8798");
        System.out.println("nuevo role:"+empleado.getRole());


        //-------------------------------------------------------------------------------------------------------------------


        //Pruebas Clase com.tecnomaster.Analisysis_Code.MovimientoDinero


        //leer y modificar el Monto
        MovimientoDinero din1 = new MovimientoDinero(10000, true, "consignacion", empleado);
        System.out.println("el movimiento de dinero es: "+din1);
        System.out.println("El monto del movimiento es de: "+din1.getMonto());
        din1.setMonto(-15000);
        System.out.println("El nuevo monto es de : "+din1.getMonto());

        //Falta leer y modificar el tipo de movimiento


        //leer y modificar el tipo de movimiento
        System.out.println("El tipo de movimiento es: "+din1.getConceptoMovimiento());
        din1.setConceptoMovimiento("Retiro");
        System.out.println("el nuevo movimiento es: "+din1.getConceptoMovimiento());

        //definir qué usuario fue encargado de registrar el movimiento
        System.out.println("el usuario encargado del movimiento fue: "+empleado.getNombreEmpleado());

        //Rol del usuario encargado del movimiento

        System.out.println("el rol del usuario encargado del movimiento fue: "+empleado.getRole());













    }
}
