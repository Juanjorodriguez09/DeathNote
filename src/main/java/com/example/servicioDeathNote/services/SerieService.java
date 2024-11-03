package com.example.servicioDeathNote.services;

import com.example.servicioDeathNote.models.Serie;
import com.example.servicioDeathNote.models.Temporada;
import com.example.servicioDeathNote.models.Capitulo;
import com.example.servicioDeathNote.models.Personaje;
import com.example.servicioDeathNote.repositories.SerieRepository;
import com.example.servicioDeathNote.repositories.TemporadaRepository;
import com.example.servicioDeathNote.repositories.CapituloRepository;
import com.example.servicioDeathNote.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private CapituloRepository capituloRepository;
    @Autowired
    private PersonajeRepository personajeRepository;

    // Métodos existentes
    public Serie getSerieById(Long id) {
        return serieRepository.findById(id).orElse(null);
    }

    public List<Serie> getAllSeries() {
        return serieRepository.findAll();
    }

    public Serie addSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    public Serie updateSerie(Long id, Serie serie) {
        Optional<Serie> existingSerie = serieRepository.findById(id);
        if (existingSerie.isPresent()) {
            Serie updatedSerie = existingSerie.get();
            updatedSerie.setNombre(serie.getNombre());
            updatedSerie.setDescripcion(serie.getDescripcion());
            updatedSerie.setPosterUrl(serie.getPosterUrl());
            updatedSerie.setClasificacion(serie.getClasificacion());
            return serieRepository.save(updatedSerie);
        } else {
            return null;
        }
    }

    public void deleteSerie(Long id) {
        serieRepository.deleteById(id);
    }

    public Serie save(Serie serie) {
        return serieRepository.save(serie);
    }

    // Métodos nuevos para cumplir con los requerimientos adicionales

    // Obtener la información de la serie por su nombre
    public Serie getSerieInfo(String nombre) {
        return serieRepository.findByNombre(nombre);
    }

    // Obtener todas las temporadas de una serie específica
    public List<Temporada> getAllTemporadas(String nombreSerie) {
        Serie serie = serieRepository.findByNombre(nombreSerie);
        if (serie != null) {
            return temporadaRepository.findBySerieId(serie.getId());
        }
        return List.of();
    }

    // Obtener capítulos de una temporada específica
    public List<Capitulo> getCapitulosByTemporada(Long temporadaId) {
        return capituloRepository.findByTemporadaId(temporadaId);
    }

    // Obtener los detalles de un capítulo específico por su código
    public Capitulo getCapituloDetails(String codigo) {
        return capituloRepository.findByCodigo(codigo);
    }

    // Obtener todos los personajes de una serie específica
    public List<Personaje> getAllPersonajes(String nombreSerie) {
        Serie serie = serieRepository.findByNombre(nombreSerie);
        if (serie != null) {
            return personajeRepository.findBySerieId(serie.getId());
        }
        return List.of();
    }
}
