package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "asunto_propio")
public class AsuntoPropio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate diaSolicitado;

    private String descripcion;

    private Boolean aprobado;

    private LocalDateTime fechaTramitacion;

    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    private Docente docente;

    @PrePersist
    public void prePersist() {
        this.fechaTramitacion = LocalDateTime.now();
        if (this.aprobado == null) {
            this.aprobado = false; // Por defecto no aprobado
        }
    }
}