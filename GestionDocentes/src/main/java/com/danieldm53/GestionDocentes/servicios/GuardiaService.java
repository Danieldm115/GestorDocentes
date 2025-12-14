package com.danieldm53.GestionDocentes.servicios;

import com.danieldm53.GestionDocentes.modelos.Docente;
import com.danieldm53.GestionDocentes.modelos.Falta;
import com.danieldm53.GestionDocentes.repositorios.DocenteRepository;
import com.danieldm53.GestionDocentes.repositorios.FaltaRepository;
import com.danieldm53.GestionDocentes.repositorios.HorarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GuardiaService {
    private final FaltaRepository faltaRepo;
    private final DocenteRepository docenteRepo;
    private final HorarioRepository horarioRepo;

    @Transactional
    public String asignarGuardia(Long faltaId) {
        Falta falta = faltaRepo.findById(faltaId)
                .orElseThrow(() -> new RuntimeException("Falta no encontrada"));
        if (falta.getDocenteCubre() != null) {
            return "Esta falta ya está cubierta por " + falta.getDocenteCubre().getNombre();
        }

        Docente docenteAusente = falta.getHorario().getDocente();
        Long departamentoId = docenteAusente.getDepartamento().getId();

        Integer dia = falta.getHorario().getDia();
        Integer hora = falta.getHorario().getHora();

        List<Docente> candidatos = docenteRepo.findByDepartamentoIdOrderByGuardiasRealizadasAsc(departamentoId);

        Docente elegido = null;

        for (Docente candidato : candidatos) {
            if (candidato.getId().equals(docenteAusente.getId())) continue;
            boolean estaOcupado = horarioRepo.findByDocenteIdAndDiaAndHora(candidato.getId(), dia, hora).isPresent();

            if (!estaOcupado) {
                elegido = candidato;
                break;
            }
        }

        if (elegido != null) {
            falta.setDocenteCubre(elegido);
            elegido.setGuardiasRealizadas(elegido.getGuardiasRealizadas() + 1);
            faltaRepo.save(falta);
            docenteRepo.save(elegido);
            return "Guardia asignada a: " + elegido.getNombre() + " " + elegido.getApellidos();
        } else {
            return "AVISO: No se encontró ningún profesor del departamento disponible.";
        }
    }
}