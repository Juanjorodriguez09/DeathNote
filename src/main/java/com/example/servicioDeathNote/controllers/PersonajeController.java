package com.example.servicioDeathNote.controllers;


import com.example.servicioDeathNote.models.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.servicioDeathNote.services.PersonajeService;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping("/{id}")
    public Personaje getPersonajeById(@PathVariable Long id) {
        return personajeService.getPersonajeById(id);
    }

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.getAllPersonajes();
    }

    @PostMapping
    public Personaje addPersonaje(@RequestBody Personaje personaje) {
        return personajeService.addPersonaje(personaje);
    }

    @PutMapping("/{id}")
    public Personaje updatePersonaje(@PathVariable Long id, @RequestBody Personaje personaje) {
        return personajeService.updatePersonaje(id, personaje);
    }

    @DeleteMapping("/{id}")
    public void deletePersonaje(@PathVariable Long id) {
        personajeService.deletePersonaje(id);
    }
    @GetMapping("/personajes")
    public String verPersonajes(Model model) {
        // Lógica para obtener y mostrar personajes
        return "personajes"; // Asegúrate de tener un archivo personajes.html en templates
    }
}
