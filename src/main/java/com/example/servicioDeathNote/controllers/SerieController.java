package com.example.servicioDeathNote.controllers;

import com.example.servicioDeathNote.models.Serie;
import com.example.servicioDeathNote.models.Temporada;
import com.example.servicioDeathNote.models.Capitulo;
import com.example.servicioDeathNote.models.Personaje;
import com.example.servicioDeathNote.services.SerieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SerieController {

    private final SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    // Obtener toda la información de la serie "Death Note"
    @GetMapping("/serie")
    public Serie getSerieInfo() {
        return serieService.getSerieInfo("Death Note");
    }

    // Obtener todas las temporadas de la serie "Death Note"
    @GetMapping("/temporadas")
    public List<Temporada> getTemporadas() {
        return serieService.getAllTemporadas("Death Note");
    }

    // Obtener capítulos por temporada específica
    @GetMapping("/temporada/{temporadaId}/capitulos")
    public List<Capitulo> getCapitulosByTemporada(@PathVariable Long temporadaId) {
        return serieService.getCapitulosByTemporada(temporadaId);
    }

    // Obtener detalles de un capítulo específico por su código
    @GetMapping("/capitulo/{codigo}")
    public Capitulo getCapituloDetails(@PathVariable String codigo) {
        return serieService.getCapituloDetails(codigo);
    }

    // Obtener todos los personajes de la serie "Death Note"
    @GetMapping("/personajes")
    public List<Personaje> getPersonajes() {
        return serieService.getAllPersonajes("Death Note");
    }

    // Obtener todas las series (para propósitos generales o administración)
    @GetMapping("/series")
    public List<Serie> getAllSeries() {
        return serieService.getAllSeries();
    }

    // Agregar una nueva serie (para propósitos generales o administración)
    @PostMapping("/series")
    public Serie addSerie(@RequestBody Serie serie) {
        return serieService.addSerie(serie);
    }
}
