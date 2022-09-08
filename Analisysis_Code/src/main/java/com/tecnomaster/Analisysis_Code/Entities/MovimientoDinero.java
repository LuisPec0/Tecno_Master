package com.tecnomaster.Analisysis_Code.Entities;

import java.util.Date;

public class MovimientoDinero {
    //Atributos
    private int id;
    private double monto;
    private boolean tipoMonto;
    private String conceptoMovimiento;
    private Empleado usuario; // Usuario es un objeto de la clase empleado
    //@Temporal(TemporalType.DATE)
    //@Column(nullable = false)
    private Date fechaCreacion;
    //@Temporal(TemporalType.DATE)
    //@Column(nullable = false)
    private Date fechaActualizacion;

    //Constructor
    public MovimientoDinero(double monto, String conceptoMovimiento, Empleado usuario, Date fechaCreacion, Date fechaActualizacion) {
        this.monto = monto;
        
        if(monto < 0){
            tipoMonto = false;
        }else{
            tipoMonto = true;
        }
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }


    //Getter y Setters

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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

    public void agregarMonto(double nuevoMonto){
        monto += nuevoMonto;
    }

}
