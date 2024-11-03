package com.example.servicioDeathNote.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String creador;
    private String clasificacion;
    private String posterUrl;
    private Integer numeroTemporadas;
    private Integer anoEmision;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Temporada> temporadas;

    // Constructor vacío
    public Serie() {
    }

    public Serie(String nombre, String descripcion, String creador, String clasificacion,
                 String posterUrl, Integer numeroTemporadas, Integer anoEmision) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creador = creador;
        this.clasificacion = clasificacion;
        this.posterUrl = posterUrl;
        this.numeroTemporadas = numeroTemporadas;
        this.anoEmision = anoEmision;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public Integer getAnoEmision() {
        return anoEmision;
    }

    public void setAnoEmision(Integer anoEmision) {
        this.anoEmision = anoEmision;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public void setPersonajes(List<Personaje> list) {

    }
}
