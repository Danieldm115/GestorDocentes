package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "asignatura")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter  @Setter
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String siglas;

    @Column(nullable = false)
    private int curso;

    @ManyToOne
    @JoinColumn(name = "ciclo_id", nullable = false)
    private Ciclo ciclo;

}
