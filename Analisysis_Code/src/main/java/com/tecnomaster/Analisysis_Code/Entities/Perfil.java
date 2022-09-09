package com.tecnomaster.Analisysis_Code.Entities;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Perfil")
public class Perfil {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, length = 30)
    private String Id;

    @Column(nullable = false, length = 50)
    private String imagen;

    @Column(nullable = false, length = 50)
    private String telefono;

    @Column(nullable = false, length = 50)
    private Date FechaCreacion;

    @Column(nullable = false, length = 50)
    private Date FechaActualización;

    //@OnetoOne
    @JoinColumn(name = "Cedula")
    private Empleado empleado;

    public Perfil() {
    }

    public Perfil(String id, String imagen, String telefono, Date fechaCreacion, Date fechaActualización, Empleado empleado) {
        Id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        FechaCreacion = fechaCreacion;
        FechaActualización = fechaActualización;
        this.empleado = empleado;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
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

    public Date getFechaActualización() {
        return FechaActualización;
    }

    public void setFechaActualización(Date fechaActualización) {
        FechaActualización = fechaActualización;
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
                "Id='" + Id + '\'' +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                ", FechaCreacion=" + FechaCreacion +
                ", FechaActualización=" + FechaActualización +
                ", empleado=" + empleado +
                '}';
    }
}

