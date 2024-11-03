package com.example.servicioDeathNote.controllers;

import com.example.servicioDeathNote.models.Capitulo;
import com.example.servicioDeathNote.models.Serie;
import com.example.servicioDeathNote.models.Temporada;
import com.example.servicioDeathNote.services.CapituloService;
import com.example.servicioDeathNote.services.SerieService;
import com.example.servicioDeathNote.services.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.List;

@Controller
public class HomeController {

    private final SerieService serieService;
    private final TemporadaService temporadaService;
    private final CapituloService capituloService;

    @Autowired
    public HomeController(SerieService serieService, TemporadaService temporadaService, CapituloService capituloService) {
        this.serieService = serieService;
        this.temporadaService = temporadaService;
        this.capituloService = capituloService;
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        // Obtener la serie principal (asumiendo que solo tienes una en la base de datos)
        Serie serie = serieService.getSerieInfo("Death Note"); // Cambia al método adecuado en `SerieService`

        // Cargar temporadas y el capítulo mejor calificado de la serie
        List<Temporada> temporadas = temporadaService.getTemporadasBySerie(serie.getId());
        Capitulo capituloMejorCalificado = capituloService.getCapitulosBySerie(serie.getId())
                .stream()
                .max(Comparator.comparing(Capitulo::getCalificacion))
                .orElse(null);

        // Añadir los atributos al modelo para la vista
        model.addAttribute("serie", serie);
        model.addAttribute("temporadas", temporadas);
        model.addAttribute("capituloMejorCalificado", capituloMejorCalificado);

        return "index";
    }
}
