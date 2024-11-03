package com.example.servicioDeathNote.controllers;


import com.example.servicioDeathNote.models.Capitulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.servicioDeathNote.services.CapituloService;

import java.util.List;

@RestController
@RequestMapping("/capitulos")
public class CapituloController {

    @Autowired
    private CapituloService capituloService;

    @GetMapping("/{id}")
    public Capitulo getCapituloById(@PathVariable Long id) {
        return capituloService.getCapituloById(id);
    }

    @GetMapping("/temporada/{temporadaId}")
    public List<Capitulo> getCapitulosByTemporadaId(@PathVariable Long temporadaId) {
        return capituloService.getCapitulosByTemporadaId(temporadaId);
    }

    @PostMapping
    public Capitulo addCapitulo(@RequestBody Capitulo capitulo) {
        return capituloService.addCapitulo(capitulo);
    }

    @PutMapping("/{id}")
    public Capitulo updateCapitulo(@PathVariable Long id, @RequestBody Capitulo capitulo) {
        return capituloService.updateCapitulo(id, capitulo);
    }

    @DeleteMapping("/{id}")
    public void deleteCapitulo(@PathVariable Long id) {
        capituloService.deleteCapitulo(id);
    }
    @GetMapping("/capitulos")
    public String verCapitulos(Model model) {
        // Lógica para obtener y mostrar capítulos
        return "capitulos"; // Asegúrate de tener un archivo capitulos.html en templates
    }
}

