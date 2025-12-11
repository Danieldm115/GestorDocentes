package com.danieldm53.GestionDocentes.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "asunto_propio")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter  @Setter
public class AsuntoPropio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "dia_solicitado", nullable = false)
    private LocalDate diaSolicitado;

    private String descripcion;

    @Column(name = "fecha_tramitacion")
    private LocalDateTime fechaTramitacion;

    /*
     * null = Pendiente (Estado inicial)
     * true = Aprobado
     * false = Rechazado
     */
    private Boolean aprobado;

    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    @JsonIgnore
    private Docente docente;
}