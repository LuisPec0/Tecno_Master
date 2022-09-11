package com.tecnomaster.Analisysis_Code.Repository;

import com.tecnomaster.Analisysis_Code.Entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {
    ArrayList<Empleado> findByNombreEmpleado(String empleado);
}
