package com.tecnomaster.Analisysis_Code.Repository;



import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Integer> {
    //Método para filtrar movimientos por empleado
    @Query(value = "select * from MovimientosDinero where id= ?1", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmpleado(Integer id);

    //Método para filtrar movimientos por empresa
    @Query(value = "select * from MovimientosDinero whre empleado_id in (select id from empleado where id= ?1", nativeQuery = true)

    public abstract ArrayList<MovimientoDinero> findByEmpresa(Integer id);

}