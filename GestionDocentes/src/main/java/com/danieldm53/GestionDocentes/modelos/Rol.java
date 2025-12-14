package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer orden;

    @OneToOne
    @JoinColumn(name = "docente_id", unique = true)
    private Docente docente;
}