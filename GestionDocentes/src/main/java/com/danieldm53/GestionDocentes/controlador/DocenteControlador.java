package com.danieldm53.GestionDocentes.controlador;

import com.danieldm53.GestionDocentes.modelos.Docente;
import com.danieldm53.GestionDocentes.servicios.DocenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/docentes")
@RequiredArgsConstructor
public class DocenteControlador {

    private final DocenteService docenteService;

    @GetMapping
    public ResponseEntity<List<Docente>> obtenerTodos() {
        return ResponseEntity.ok(docenteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(docenteService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Docente> crearDocente(@RequestBody Docente docente) {
        return new ResponseEntity<>(docenteService.save(docente), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Docente> actualizarDocente(@PathVariable Long id, @RequestBody Docente docente) {
        return ResponseEntity.ok(docenteService.update(id, docente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDocente(@PathVariable Long id) {
        docenteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}