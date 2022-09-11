package com.tecnomaster.Analisysis_Code.Entities;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Empresa")//08/09/2022
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,length=30)
    private int id;
    @Column(nullable = false,length=50)
    private String nombre;
    @Column(nullable = false,length=50)
    private String direccion;
    @Column(nullable = false,length=50)
    private String telefono;
    @Column(nullable = false,length=50)
    private String nit;

    @OneToMany
    @JoinColumn(name="id")
    private Empleado empleado;

    @OneToMany
    @JoinColumn(name="Transaccion")
    private MovimientoDinero movimientoDinero;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaCreacion;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaActualizacion;

    public Empresa(int id, String nombre, String direccion, String telefono, String nit,Empleado empleado,MovimientoDinero movimientoDinero, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.empleado = empleado;
        this.movimientoDinero = movimientoDinero;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
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
