package com.example.servicioDeathNote.repositories;

import com.example.servicioDeathNote.models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    List<Personaje> findBySerieId(Long serieId);
}
