package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {

    Optional<Horario> findByDocenteIdAndDiaAndHora(Long docenteId, Integer dia, Integer hora);

    List<Horario> findByDiaAndHora(Integer dia, Integer hora);
}