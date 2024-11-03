package com.example.servicioDeathNote.repositories;

import com.example.servicioDeathNote.models.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapituloRepository extends JpaRepository<Capitulo, Long> {

    Capitulo findByCodigo(String codigo);

    List<Capitulo> findByTemporadaId(Long temporadaId);

    Capitulo findTopByOrderByCalificacionDesc();

    // Agrega este método para encontrar capítulos por el ID de la serie
    @Query("SELECT c FROM Capitulo c WHERE c.temporada.serie.id = :serieId")
    List<Capitulo> findBySerieId(@Param("serieId") Long serieId);
}
