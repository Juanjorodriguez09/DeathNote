package com.example.servicioDeathNote.services;




import com.example.servicioDeathNote.models.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.servicioDeathNote.repositories.PersonajeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public Personaje getPersonajeById(Long id) {
        return personajeRepository.findById(id).orElse(null);
    }

    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    public Personaje addPersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public Personaje updatePersonaje(Long id, Personaje personaje) {
        Optional<Personaje> existingPersonaje = personajeRepository.findById(id);
        if (existingPersonaje.isPresent()) {
            Personaje updatedPersonaje = existingPersonaje.get();
            updatedPersonaje.setNombre(personaje.getNombre());
            updatedPersonaje.setDescripcion(personaje.getDescripcion());
            updatedPersonaje.setImagenUrl(personaje.getImagenUrl());
            return personajeRepository.save(updatedPersonaje);
        } else {
            return null;
        }
    }

    public void deletePersonaje(Long id) {
        personajeRepository.deleteById(id);
    }

    public List<Personaje> getPersonajesBySerie(Long serieId) {
        return personajeRepository.findBySerieId(serieId);
    }

    public Personaje save(Personaje personaje) {
        return personajeRepository.save(personaje);
    }
}