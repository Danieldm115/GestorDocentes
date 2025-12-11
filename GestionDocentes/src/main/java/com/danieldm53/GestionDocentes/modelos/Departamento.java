package com.danieldm53.GestionDocentes.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departamento")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(unique = true, nullable = false)
    private String codigo;

    /* Puede estar vacio porque puede no tener aun el departamento instalada
    * la linea telefonica y aun así ser creado ni unico porque mas de un
    * departamento puede tener el mismo número*/
    private String telefono;
}
