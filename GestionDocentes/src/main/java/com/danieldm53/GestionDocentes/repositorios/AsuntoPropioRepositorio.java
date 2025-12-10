package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AsuntoPropioRepositorio extends JpaRepository<AsuntoPropio, Integer> {
    public Optional<AsuntoPropio> findById(Integer id);

    public List<AsuntoPropio> findByDocenteId(Integer docenteId);
}
