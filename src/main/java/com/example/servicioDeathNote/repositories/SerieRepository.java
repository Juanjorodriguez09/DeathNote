
package com.example.servicioDeathNote.repositories;


import com.example.servicioDeathNote.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
    Serie findByNombre(String nombre);

}
