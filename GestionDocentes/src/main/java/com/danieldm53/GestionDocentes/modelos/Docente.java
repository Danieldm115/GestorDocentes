package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "docente")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(unique = true, nullable = false)
    private String email;

    /* REVISAR */
    private String siglas;

    @Column(name = "guardias_realizadas")
    private int guardiasRealizadas = 0;

    @ManyToOne
    @JoinColumn(name = "departamento_id", nullable = false)
    private Departamento departamento;

    @OneToOne (mappedBy = "docente", cascade = CascadeType.ALL)
    private Rol rol;


    @OneToMany (mappedBy = "docente", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<AsuntoPropio> asuntoPropios;
}
