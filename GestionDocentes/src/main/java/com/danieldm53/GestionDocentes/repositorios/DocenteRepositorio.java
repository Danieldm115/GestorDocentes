package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocenteRepositorio extends JpaRepository<Docente, Integer>{
    /* Buscar por id */
    public Optional<Docente> findById(Integer id);
}
