package com.danieldm53.GestionDocentes.controlador;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.servicios.AsuntoPropioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/asuntos-propios")
@RequiredArgsConstructor
public class AsuntoPropioControlador {

    private final AsuntoPropioService asuntoPropioService;

    @GetMapping
    public ResponseEntity<List<AsuntoPropio>> obtenerTodos() {
        return ResponseEntity.ok(asuntoPropioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsuntoPropio> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(asuntoPropioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AsuntoPropio> solicitarAsunto(@RequestBody AsuntoPropio asuntoPropio) {
        return new ResponseEntity<>(asuntoPropioService.save(asuntoPropio), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsuntoPropio> actualizarSolicitud(@PathVariable Long id, @RequestBody AsuntoPropio asuntoPropio) {
        return ResponseEntity.ok(asuntoPropioService.update(id, asuntoPropio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarSolicitud(@PathVariable Long id) {
        asuntoPropioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}