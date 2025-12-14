package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "falta")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class Falta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    private String anotacion;

    private String material;

    @Column(name = "realizada")
    private Boolean realizada;

    @ManyToOne
    @JoinColumn(name = "horario_id", nullable = false)
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "docente_cubre_id")
    private Docente docenteCubre;
}