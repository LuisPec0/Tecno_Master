package com.tecnomaster.Analisysis_Code.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @Column(unique=true)
    private  int id;
    @Column(nullable = false,length = 50)
    private  String nombreEmpleado;
    @Column(nullable = false,length = 50)
    private  String correo;
    @Column(nullable = false,length = 50)
    private  String role;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="nit", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Empresa  empresa;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false,length = 50)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false,length = 50)
    private  Date fechaActualizacion;

    public Empleado() {

    }
    @PrePersist
    public void prePersist()
    {
        this.fechaActualizacion=new Date();
        this.fechaCreacion=new Date();



    }

    public Empleado(int id, String nombreEmpleado, String correo, String role, Empresa empresa, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setRole(String role) {
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

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", role='" + role + '\'' +
                ", empresa=" + empresa +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }



}
