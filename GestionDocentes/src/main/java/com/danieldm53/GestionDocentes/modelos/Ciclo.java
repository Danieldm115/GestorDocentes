package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "ciclos")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Ciclo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciclo")
    private int id;

    private String nombre;
    private String familia;
    private String codigo;
}
