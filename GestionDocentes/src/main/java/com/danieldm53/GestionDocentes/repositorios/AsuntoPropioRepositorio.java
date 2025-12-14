package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsuntoPropioRepositorio extends JpaRepository<AsuntoPropio, Long> {

    /* TAREA: "Obtener los días de asuntos propios pendientes"
     * Busca por el estado 'aprobado' (true/false) o si está pendiente.
     * Según tu diagrama tienes un boolean 'aprobado'. */
    List<AsuntoPropio> findByAprobadoFalse();

    /* VALIDACIÓN UC2:
     * Busca todos los asuntos propios de un profesor para contar cuántos lleva.
     * Si ya lleva los máximos permitidos, no le dejas pedir más. */
    List<AsuntoPropio> findByDocente(Docente docente); // 'dispone' en el diagrama
}