package com.EjerciciosRelaciones.EjerciciosRelaciones.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private LocalDate fecha_finalizacion;

    //Asignar la relación bidireccional
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Tema> listaTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, LocalDate fecha_finalizacion, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaTemas = listaTemas;
    }

    public Long getId_curso() {
        return id_curso;
    }

    public void setId_curso(Long id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public LocalDate getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(LocalDate fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public List<Tema> getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(List<Tema> listaTemas) {
        this.listaTemas = listaTemas;
    }
}
