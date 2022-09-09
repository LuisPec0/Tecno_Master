package com.tecnomaster.Analisysis_Code.Entities;

<<<<<<< HEAD


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
=======
import java.util.Calendar;
import java.util.Date;

//Revisar esta clase que servirá en el Front para la de registrar usuario

public class Perfil {

    private  int id;
    private String imagen;
    private String telefono;
    // el user user
>>>>>>> 3c16bda67d48528fab7e3755b357a4e66405112f

    public Perfil() {
    }

<<<<<<< HEAD
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
=======
    public Perfil(int id, String imagen, String telefono) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
>>>>>>> 3c16bda67d48528fab7e3755b357a4e66405112f
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

<<<<<<< HEAD
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
=======
    public String getTelefon() {
        return telefono;
    }

    public void setTelefon(String telefon) {
        this.telefono = telefon;
    }

>>>>>>> 3c16bda67d48528fab7e3755b357a4e66405112f

    @Override
    public String toString() {
        return "Perfil{" +
<<<<<<< HEAD
                "Id='" + Id + '\'' +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                ", FechaCreacion=" + FechaCreacion +
                ", FechaActualización=" + FechaActualización +
                ", empleado=" + empleado +
                '}';
    }
}

=======
                "id=" + id +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
>>>>>>> 3c16bda67d48528fab7e3755b357a4e66405112f
