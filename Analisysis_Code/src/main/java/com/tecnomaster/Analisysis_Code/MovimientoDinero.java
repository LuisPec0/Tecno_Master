package com.tecnomaster.Analisysis_Code;

public class MovimientoDinero {
    //Atributos
    private double monto;
    private boolean tipo; //Donde False: Es un movimiento negativo y True: Es un movimiento positivo

    private String conceptoMovimiento;
    private Empleado usuario; // Usuario es un objeto de la clase empleado

    //Constructor
    public MovimientoDinero(double monto, boolean tipo, String conceptoMovimiento, Empleado usuario) {
        this.monto = monto;
        this.tipo = tipo;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
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

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isTipo() {
        return tipo;
    }

    //Metodo toString

    @java.lang.Override
    public java.lang.String toString() {
        return "com.tecnomaster.Analisysis_Code.MovimientoDinero{" +
                "monto=" + monto +
                ", tipo=" + tipo +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario=" + usuario.getNombreEmpleado() +
                '}';

  
    }
}
