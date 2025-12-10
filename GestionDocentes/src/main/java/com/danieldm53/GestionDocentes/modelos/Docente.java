package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "docentes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private int id;

    private String nombre;
    private String apellido;
    private String email;
    private String siglas;

    @OneToMany (mappedBy = "docente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsuntoPropio> asuntos_propios;
}
