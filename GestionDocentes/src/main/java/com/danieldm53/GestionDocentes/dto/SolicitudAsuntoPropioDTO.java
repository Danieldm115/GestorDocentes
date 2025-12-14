package com.danieldm53.GestionDocentes.dto;

import lombok.*;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class SolicitudAsuntoPropioDTO {
    private Long docenteId;
    private LocalDate fechaSolicitada;
    private String descripcion;
}