package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

    Optional<Docente> findByEmail(String email);

    List<Docente> findByOrderByApellidosAsc();

    List<Docente> findByDepartamentoNombre(String nombre);

    List<Docente> findByDepartamentoIdOrderByGuardiasRealizadasAsc(Long departamentoId);

    @Query("SELECT a.docente FROM AsuntoPropio a WHERE a.aprobado = true AND a.diaSolicitado < CURRENT_DATE GROUP BY a.docente ORDER BY COUNT(a) DESC LIMIT 1")
    Optional<Docente> findDocenteConMasDiasDisfrutados();
}