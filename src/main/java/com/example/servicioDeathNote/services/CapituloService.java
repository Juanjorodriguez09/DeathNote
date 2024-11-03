package com.example.servicioDeathNote.services;



import com.example.servicioDeathNote.models.Capitulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.servicioDeathNote.repositories.CapituloRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CapituloService {

    @Autowired
    private CapituloRepository capituloRepository;

    public Capitulo getCapituloById(Long id) {
        return capituloRepository.findById(id).orElse(null);
    }

    public List<Capitulo> getCapitulosByTemporadaId(Long temporadaId) {
        return capituloRepository.findByTemporadaId(temporadaId);
    }

    public Capitulo addCapitulo(Capitulo capitulo) {
        return capituloRepository.save(capitulo);
    }

    public Capitulo updateCapitulo(Long id, Capitulo capitulo) {
        Optional<Capitulo> existingCapitulo = capituloRepository.findById(id);
        if (existingCapitulo.isPresent()) {
            Capitulo updatedCapitulo = existingCapitulo.get();
            updatedCapitulo.setNombre(capitulo.getNombre());
            updatedCapitulo.setCodigo(capitulo.getCodigo());
            updatedCapitulo.setDescripcion(capitulo.getDescripcion());
            updatedCapitulo.setImagen1Url(capitulo.getImagen1Url());
            updatedCapitulo.setTemporada(capitulo.getTemporada());
            return capituloRepository.save(updatedCapitulo);
        } else {
            return null;
        }
    }

    public void deleteCapitulo(Long id) {
        capituloRepository.deleteById(id);
    }

    public Capitulo getMejorCalificado() {
        return capituloRepository.findTopByOrderByCalificacionDesc();
    }

    public Capitulo save(Capitulo capitulo) {
        return capituloRepository.save(capitulo);
    }
    public List<Capitulo> getCapitulosBySerie(Long serieId) {
        return capituloRepository.findBySerieId(serieId);
    }
}