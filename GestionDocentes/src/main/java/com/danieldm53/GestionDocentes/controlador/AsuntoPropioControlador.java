package com.danieldm53.GestionDocentes.controlador;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.servicios.AsuntoPropioServicio;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asuntos-propios")
public class AsuntoPropioControlador {
    AsuntoPropioServicio asuntoPropioServicio;

    public AsuntoPropioControlador(AsuntoPropioServicio asuntoPropioServicio) {
        this.asuntoPropioServicio = asuntoPropioServicio;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AsuntoPropio> getAsuntoById(@NonNull @PathVariable("id") int id) throws Exception {
        AsuntoPropio asuntoPropio = asuntoPropioServicio.getAsuntoByIg(id);
        return ResponseEntity.ok(asuntoPropio);
    }
}
