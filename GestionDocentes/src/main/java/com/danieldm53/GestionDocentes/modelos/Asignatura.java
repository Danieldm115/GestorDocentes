package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "asignaturas")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private int id;

    private String nombre;
    private String codigo;
    private int horasSemanales;

}
