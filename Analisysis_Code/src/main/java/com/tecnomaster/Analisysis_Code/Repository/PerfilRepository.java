package com.tecnomaster.Analisysis_Code.Repository;

import com.tecnomaster.Analisysis_Code.Entities.Perfil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {

}
