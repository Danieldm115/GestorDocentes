package com.danieldm53.GestionDocentes.servicios;

import com.danieldm53.GestionDocentes.dto.SolicitudAsuntoPropioDTO;
import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.modelos.Docente;
import com.danieldm53.GestionDocentes.repositorios.AsuntoPropioRepository;
import com.danieldm53.GestionDocentes.repositorios.DocenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AsuntoPropioService {
    private final AsuntoPropioRepository asuntoRepo;
    private final DocenteRepository docenteRepo;

    public void solicitarDia(SolicitudAsuntoPropioDTO solicitudDTO) {
        Docente docente = docenteRepo.findById(solicitudDTO.getDocenteId())
                .orElseThrow(() -> new RuntimeException("Docente no encontrado"));

        if (solicitudDTO.getFechaSolicitada().isBefore(java.time.LocalDate.now())) {
            throw new RuntimeException("No puedes pedir días en el pasado");
        }

        AsuntoPropio asunto = AsuntoPropio.builder()
                .docente(docente)
                .diaSolicitado(solicitudDTO.getFechaSolicitada())
                .descripcion(solicitudDTO.getDescripcion())
                .fechaTramitacion(LocalDateTime.now())
                .aprobado(null)
                .build();

        asuntoRepo.save(asunto);
    }

    @Transactional
    public void validarDia(Long asuntoId, boolean aceptado) {
        AsuntoPropio asunto = asuntoRepo.findById(asuntoId)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));

        asunto.setAprobado(aceptado);
        asuntoRepo.save(asunto);
    }

    public List<AsuntoPropio> listarPendientes() {
        return asuntoRepo.findByAprobadoIsNull();
    }
}
