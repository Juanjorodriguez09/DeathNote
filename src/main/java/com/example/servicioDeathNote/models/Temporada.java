package com.example.servicioDeathNote.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero; // Número de la temporada
    private int ano; // Año de emisión

    @ManyToOne
    private Serie serie;

    // Constructor vacío
    public Temporada() {
    }

    // Constructor con parámetros
    public Temporada(int numero, int ano, Serie serie) {
        this.numero = numero;
        this.ano = ano;
        this.serie = serie;
    }

    public Temporada(String s, Serie deathNote) {
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setCapitulos(List<Capitulo> list) {
    }
}
