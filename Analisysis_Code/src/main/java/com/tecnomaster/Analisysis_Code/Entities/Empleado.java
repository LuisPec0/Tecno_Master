package com.tecnomaster.Analisysis_Code.Entities;

public class Empleado {
    private  int id;
    private static String nombreEmpleado;
    private  String correo;
    private  String role;
    private Empresa  empresa;

    public Empleado(int id, String nombreEmpleado, String correo, String role, Empresa empresa)
    {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNombreEmpleado() {
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
