package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AsuntoPropioRepository extends JpaRepository<AsuntoPropio, Long> {

    @Query("SELECT a FROM AsuntoPropio a WHERE a.aprobado = true AND a.diaSolicitado >= CURRENT_DATE AND a.docente.id = :docenteId")
    List<AsuntoPropio> findPendientesDeDisfrutar(Long docenteId);

    List<AsuntoPropio> findByDocenteId(Long docenteId);

    List<AsuntoPropio> findByAprobadoIsNull();
}