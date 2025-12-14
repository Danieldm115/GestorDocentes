package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Falta;
import com.danieldm53.GestionDocentes.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FaltaRepository extends JpaRepository<Falta, Long> {

    /* Ver el cuadrante diario de faltas para pintar la tabla en el frontend. */
    List<Falta> findByFecha(LocalDate fecha);

    /* LÓGICA DE GUARDIAS:
     * Busca las faltas donde el campo 'docenteCubre' (la relación 'cubre' del diagrama)
     * es NULL. Estas son las guardias que NADIE ha cogido todavía. */
    // Nota: Necesitas llamar al campo 'docenteCubre' en tu entidad Falta.
    List<Falta> findByDocenteCubreIsNull();

    /* Busqueda de las faltas que ha cubierto un profesor específico (sus guardias realizadas). */
    List<Falta> findByDocenteCubre(Docente docente);
}