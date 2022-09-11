package com.tecnomaster.Analisysis_Code.Entities;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Perfil")
public class Perfil {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, length = 30)
    private int Id;

    @Column(nullable = false, length = 50)
    private String imagen;

    @Column(nullable = false, length = 50)
    private String telefono;


    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date FechaCreacion;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date FechaActualizacion;

    @OneToOne
    @JoinColumn(name = "Cedula")
    private Empleado empleado;

    @PrePersist
    public void prePersist(){
        this.FechaActualizacion = new Date();
    }

    public Perfil() {
    }

    public Perfil(int id, String imagen, String telefono, Date fechaCreacion, Date fechaActualizacion, Empleado empleado) {
        Id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        FechaCreacion = fechaCreacion;
        FechaActualizacion = fechaActualizacion;
        this.empleado = empleado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        FechaActualizacion = fechaActualizacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "Id=" + Id +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                ", FechaCreacion=" + FechaCreacion +
                ", FechaActualizacion=" + FechaActualizacion +
                ", empleado=" + empleado +
                '}';
    }
}





