package com.example.servicioDeathNote.controllers;


import com.example.servicioDeathNote.models.Temporada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.servicioDeathNote.services.TemporadaService;

import java.util.List;

@RestController
@RequestMapping("/temporadas")
public class TemporadaController {

    @Autowired
    private TemporadaService temporadaService;

    @GetMapping("/{id}")
    public Temporada getTemporadaById(@PathVariable Long id) {
        return temporadaService.getTemporadaById(id);
    }

    @GetMapping("/serie/{serieId}")
    public List<Temporada> getTemporadasBySerieId(@PathVariable Long serieId) {
        return temporadaService.getTemporadasBySerieId(serieId);
    }

    @PostMapping
    public Temporada addTemporada(@RequestBody Temporada temporada) {
        return temporadaService.addTemporada(temporada);
    }

    @PutMapping("/{id}")
    public Temporada updateTemporada(@PathVariable Long id, @RequestBody Temporada temporada) {
        return temporadaService.updateTemporada(id, temporada);
    }

    @DeleteMapping("/{id}")
    public void deleteTemporada(@PathVariable Long id) {
        temporadaService.deleteTemporada(id);
    }

    @GetMapping("/temporadas")
    public String verTemporadas(Model model) {
        // Lógica para obtener y mostrar temporadas
        return "temporadas";
    }
}