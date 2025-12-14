package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
    Asignatura findByNombre(String nombre);
}