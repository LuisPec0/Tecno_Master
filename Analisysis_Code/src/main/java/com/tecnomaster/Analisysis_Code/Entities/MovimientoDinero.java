package com.tecnomaster.Analisysis_Code.Entities;


import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 30)
    private double monto;

    @Column(nullable = false, length = 5)
    private boolean tipoMonto;

    @Column(nullable = false, length = 250)
    private String conceptoMovimiento;

    @ManyToOne
    @JoinColumn(name="nombre")
    private Empresa empresa; //Empresa es un objeto de la clase Empresa *

    @ManyToOne
    @JoinColumn(name="nombreEmpleado")
    private Empleado usuario; // Usuario es un objeto de la clase empleado

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaCreacion;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaActualizacion;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }

    @PrePersist
    public void prePersistActualizacion(){
        this.fechaActualizacion = new Date();
    }

    //    Construtor Vacio
    public MovimientoDinero() {
    }

    //    Constructor con parametros
    public MovimientoDinero(int id, double monto, String conceptoMovimiento, Empresa empresa, Empleado usuario, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
        this.monto = monto;
        this.empresa = empresa;

        if(monto < 0){
            this.tipoMonto = false;
        }else{
            this.tipoMonto = true;
        }
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }


    //Getter y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = (float) monto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public void setTipo(boolean tipoMonto) {
        this.tipoMonto = tipoMonto;
    }

    public boolean isTipoMonto() {
        return tipoMonto;
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

    //Metodo toString

    @java.lang.Override
    public java.lang.String toString() {
        return "com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero{" +
                "monto=" + monto +
                ", tipoMonto=" + tipoMonto +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario=" + usuario.getNombreEmpleado() +
                '}';


    }

}