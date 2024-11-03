package com.example.servicioDeathNote.repositories;

import com.example.servicioDeathNote.models.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    List<Temporada> findBySerieId(Long serieId);
}
