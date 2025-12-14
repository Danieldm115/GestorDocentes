package com.danieldm53.GestionDocentes.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

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

    private String telefono;

    @OneToMany(mappedBy = "departamento")
    @JsonIgnore
    private List<Docente> docentes;
}
