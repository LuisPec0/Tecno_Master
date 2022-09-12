package com.tecnomaster.Analisysis_Code.Entities;



import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double monto;
    private String concepto;

    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado usuario;

    //    Construtor Vacio
    public MovimientoDinero() {
    }

    //    Constructor con parametros

    public MovimientoDinero(double monto, String concepto, Empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }


    //Getter y Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
}