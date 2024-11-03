package com.example.servicioDeathNote.models;

import jakarta.persistence.*;

@Entity
public class Capitulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String codigo;
    private String descripcion;
    private String imagen1Url;


    // Nuevo atributo para la calificación
    private Double calificacion;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;

    // Constructor vacío
    public Capitulo() {
    }

    public Capitulo(String nombre, String codigo, String descripcion, String imagen1Url,
                     Double calificacion, Temporada temporada) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.imagen1Url = imagen1Url;

        this.calificacion = calificacion;
        this.temporada = temporada;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen1Url() {
        return imagen1Url;
    }

    public void setImagen1Url(String imagen1Url) {
        this.imagen1Url = imagen1Url;
    }


    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
}
