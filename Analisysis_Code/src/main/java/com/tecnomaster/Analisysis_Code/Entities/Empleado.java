package com.tecnomaster.Analisysis_Code.Entities;

import java.util.List;

public class Empleado {

    private  String nombreEmpleado;
    private  String correo;
    private  String role;
    private Empresa empresa;

    public Empleado(String nombreEmpleado, String correo, String role, Empresa empresa)
    {

        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresa = empresa;

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

}
