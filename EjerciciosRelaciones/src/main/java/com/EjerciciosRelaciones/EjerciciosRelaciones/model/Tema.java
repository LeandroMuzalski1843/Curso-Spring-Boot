package com.EjerciciosRelaciones.EjerciciosRelaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_temas;
    private String nombre;
    private String decripcion;
    @ManyToOne
    @JoinColumn (name="id_curso")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    Curso curso;
    public Tema() {
    }

    public Tema(Long id_temas, String nombre, String decripcion) {
        this.id_temas = id_temas;
        this.nombre = nombre;
        this.decripcion = decripcion;
    }

    public Long getId_temas() {
        return id_temas;
    }

    public void setId_temas(Long id_temas) {
        this.id_temas = id_temas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
