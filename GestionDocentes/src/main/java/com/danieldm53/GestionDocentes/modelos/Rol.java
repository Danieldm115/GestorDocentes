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

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer orden;
}
