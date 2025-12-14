package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Falta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FaltaRepository extends JpaRepository<Falta, Long> {

    List<Falta> findByFecha(LocalDate fecha);

    List<Falta> findByDocenteCubreIsNull();

    List<Falta> findByDocenteCubreId(Long docenteId);
}