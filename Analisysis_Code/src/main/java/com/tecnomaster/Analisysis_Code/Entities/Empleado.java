package com.tecnomaster.Analisysis_Code.Entities;

import java.util.Date;
import java.util.List;

public class Empleado {

    private  String nombreEmpleado;
    private  String correo;
    private  String role;
    private Empresa empresa;
<<<<<<< HEAD

    public Empleado(String nombreEmpleado, String correo, String role, Empresa empresa)
    {

=======
    private List <MovimientoDinero> movimientoDinero; //MovimientoDinero Agregar}

    //@Temporal(TemporalType.DATE)
    //@Column(nullable = false)
    private Date fechaCreacion;

    //@Temporal(TemporalType.DATE)
    //@Column(nullable = false)
    private Date fechaActualizacion;

    public Empleado(int id, String nombreEmpleado, String correo, String role, Empresa empresa, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
>>>>>>> 304e7fd67161b49ff6963865bb2b8d8a8384864f
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresa = empresa;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;

        if (role.equalsIgnoreCase("administrador") || role.equalsIgnoreCase("operativo") )
        {
            String  roleEmpleado = new String(role);
            this.role= roleEmpleado.toLowerCase();

        }
        else
        {
            this.role = "operativo";

        }
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role)
    {

        if (role.equalsIgnoreCase("administrador") || role.equalsIgnoreCase("operativo") )
        {

            String  roleEmpleado = new String(role);
            this.role= roleEmpleado.toLowerCase();



        }
        else
        {
            System.out.println("Ingresar  Operativo o Administrador");

        }

    }

    public String getEmpresa() {
        return empresa.getNombre();

    }

    public void  CambiarNombreEmpresa(String nuevoNombre) {

        this.empresa.setNombre(nuevoNombre);
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
