package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Departamento;
import com.danieldm53.GestionDocentes.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docente, Long>{
    /* Buscar por email para el login */
    Optional<Docente> findByEmail(String email);

    /* Buscar por departamento */
    List<Docente> findByDepartamento(Departamento departamento);

    /* Busqueda para el profesor que ha hecho menos guardias*/
    List<Docente> findByDepartamentoOrderByGuardiasRealizadasAsc(Departamento departamento);
}
