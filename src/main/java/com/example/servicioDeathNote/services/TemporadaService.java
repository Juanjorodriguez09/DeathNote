package com.example.servicioDeathNote.services;


import com.example.servicioDeathNote.models.Temporada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.servicioDeathNote.repositories.TemporadaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TemporadaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    public Temporada getTemporadaById(Long id) {
        return temporadaRepository.findById(id).orElse(null);
    }

    public List<Temporada> getTemporadasBySerieId(Long serieId) {
        return temporadaRepository.findBySerieId(serieId);
    }

    public Temporada addTemporada(Temporada temporada) {
        return temporadaRepository.save(temporada);
    }

    public Temporada updateTemporada(Long id, Temporada temporada) {
        Optional<Temporada> existingTemporada = temporadaRepository.findById(id);
        if (existingTemporada.isPresent()) {
            Temporada updatedTemporada = existingTemporada.get();
            updatedTemporada.setNumero(temporada.getNumero());
            updatedTemporada.setAno(temporada.getAno());
            updatedTemporada.setSerie(temporada.getSerie());
            return temporadaRepository.save(updatedTemporada);
        } else {
            return null;
        }
    }

    public void deleteTemporada(Long id) {
        temporadaRepository.deleteById(id);
    }

    public List<Temporada> getTemporadasBySerie(Long serieId) {
        return temporadaRepository.findBySerieId(serieId);
    }

    public Temporada save(Temporada temporada) {
        return temporadaRepository.save(temporada);
    }
}
