package com.danieldm53.GestionDocentes.repositorios;
import com.danieldm53.GestionDocentes.modelos.Ciclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloRepository extends JpaRepository<Ciclo, Long> {
    Ciclo findByNombre(String nombre);
}