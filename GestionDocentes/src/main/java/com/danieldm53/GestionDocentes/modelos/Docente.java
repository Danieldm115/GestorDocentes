package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellidos;

    @Column(unique = true)
    private String email;

    private String siglas;

    private Integer guardiasRealizadas;

    @ManyToOne
    @JoinColumn(name = "departamento_id", nullable = false)
    private Departamento departamento;
}