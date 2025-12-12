package com.danieldm53.GestionDocentes.repositorios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

/* Gestionar peticiones de dias libres */
public interface AsuntoPropioRepositorio extends JpaRepository<AsuntoPropio, Integer> {
    /* Buscar solicitudes pendientes*/




}
