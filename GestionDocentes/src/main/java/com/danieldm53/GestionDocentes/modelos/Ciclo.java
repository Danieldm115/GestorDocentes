package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "ciclo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class Ciclo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciclo")
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String familia;

    @Column(nullable = false, unique = true)
    private String codigo;

    @OneToMany(mappedBy = "ciclo", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Asignatura> asignaturas;
}
