package com.danieldm53.GestionDocentes.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class DocenteDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private String email;
    private String siglas;
    private Long departamentoId;
    private String departamentoNombre;
    private String rolNombre;
    private Integer antiguedad;
    private int guardiasRealizadas;
}