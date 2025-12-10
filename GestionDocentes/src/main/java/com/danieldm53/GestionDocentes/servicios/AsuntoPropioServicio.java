package com.danieldm53.GestionDocentes.servicios;

import com.danieldm53.GestionDocentes.modelos.AsuntoPropio;
import com.danieldm53.GestionDocentes.repositorios.AsuntoPropioRepositorio;
import com.danieldm53.GestionDocentes.repositorios.DocentesRepositorio;
import org.springframework.stereotype.Service;

@Service
public class AsuntoPropioServicio {
    AsuntoPropioRepositorio reporiositorio;
    DocentesRepositorio docentesRepositorio;

    public AsuntoPropioServicio(AsuntoPropioRepositorio reporiositorio, DocentesRepositorio docentesRepositorio){
        this.reporiositorio = reporiositorio;
        this.docentesRepositorio = docentesRepositorio;
    }

    public AsuntoPropio getAsuntoByIg(int id){
        return reporiositorio.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el asunto propio con id: " + id));
    }
}
