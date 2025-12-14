package com.danieldm53.GestionDocentes.servicios;

import com.danieldm53.GestionDocentes.modelos.Docente;
import com.danieldm53.GestionDocentes.repositorios.DocenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DocenteService {

    private final DocenteRepository docenteRepository;

    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    public Docente findById(Long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

    public Docente update(Long id, Docente docente) {
        if (docenteRepository.existsById(id)) {
            docente.setId(id);
            return docenteRepository.save(docente);
        }
        return null;
    }

    public void deleteById(Long id) {
        docenteRepository.deleteById(id);
    }
}