package com.danieldm53.GestionDocentes.dto;

import lombok.*;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class FaltaDTO {
    private Long id;
    private LocalDate fecha;
    private String hora;
    private String aula;
    private String docenteAusenteNombre;
    private String docenteCubreNombre;
    private Boolean realizada;
    private String material;
}