package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    @Query("SELECT COUNT(d) FROM Docente d WHERE d.departamento.codigo = :codigo")
    Integer countDocentesByCodigo(String codigo);
}