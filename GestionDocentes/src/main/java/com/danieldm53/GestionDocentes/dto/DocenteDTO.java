/*
 * Uso este DTO para filtrar los datos que mando a la web.
 * Principalmente para evitar el error de bucle infinito (StackOverflow)
 * que generan las relaciones bidireccionales y para no enviar datos innecesarios.
 */
package com.danieldm53.GestionDocentes.dto;

import com.danieldm53.GestionDocentes.modelos.Docente;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class DocenteDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private String email;
    private String siglas;
    private String nombreDepartamento;

    public static DocenteDTO fromEntity(Docente docente) {
        if (docente == null) {
            return null;
        }

        return DocenteDTO.builder()
                .nombre(docente.getNombre())

                .nombreDepartamento(
                        docente.getDepartamento().getNombre()
                )
                .build();
    }
}
