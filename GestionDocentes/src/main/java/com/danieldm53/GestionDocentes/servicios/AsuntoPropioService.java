package com.danieldm53.GestionDocentes.servicios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.repositorios.AsuntoPropioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AsuntoPropioService {

    private final AsuntoPropioRepository asuntoPropioRepository;

    public List<AsuntoPropio> findAll() {
        return asuntoPropioRepository.findAll();
    }

    public AsuntoPropio findById(Long id) {
        return asuntoPropioRepository.findById(id).orElse(null);
    }

    public AsuntoPropio save(AsuntoPropio asuntoPropio) {
        return asuntoPropioRepository.save(asuntoPropio);
    }

    public AsuntoPropio update(Long id, AsuntoPropio asuntoPropio) {
        if (asuntoPropioRepository.existsById(id)) {
            asuntoPropio.setId(id);
            return asuntoPropioRepository.save(asuntoPropio);
        }
        return null;
    }

    public void deleteById(Long id) {
        asuntoPropioRepository.deleteById(id);
    }
}