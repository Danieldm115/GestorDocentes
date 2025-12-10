package com.danieldm53.GestionDocentes.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "asuntos_propios")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AsuntoPropio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asunto_propio")
    private int id;

    private Date diaSolicitado;
    private String descripcion;
    private Date fechaTramitacion;
    private boolean aprobado;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_docente", nullable = false)
    private Docente docente;

}