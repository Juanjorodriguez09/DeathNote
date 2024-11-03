package com.example.servicioDeathNote.models;

import jakarta.persistence.*;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String imagenUrl;
    private String descripcion;
    private String rol;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

    // Constructor vacío
    public Personaje() {}

    // Constructor con parámetros
    public Personaje(String nombre, String imagenUrl, String descripcion, String rol, Serie serie) {
        this.nombre = nombre;
        this.imagenUrl = imagenUrl;
        this.descripcion = descripcion;
        this.rol = rol;
        this.serie = serie;
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

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}
