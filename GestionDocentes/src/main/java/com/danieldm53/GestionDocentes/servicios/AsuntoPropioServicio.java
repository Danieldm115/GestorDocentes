package com.danieldm53.GestionDocentes.servicios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.repositorios.AsuntoPropioRepository;
import com.danieldm53.GestionDocentes.repositorios.DocenteRepository;
import org.springframework.stereotype.Service;

@Service
public class AsuntoPropioServicio {
    AsuntoPropioRepository reporiositorio;
    DocenteRepository docentesRepositorio;

    public AsuntoPropioServicio(AsuntoPropioRepository reporiositorio, DocenteRepository docentesRepositorio){
        this.reporiositorio = reporiositorio;
        this.docentesRepositorio = docentesRepositorio;
    }

    public AsuntoPropio getAsuntoByIg(int id){
        return reporiositorio.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el asunto propio con id: " + id));
    }
}
