package com.EjerciciosRelaciones.EjerciciosRelaciones.dto;

import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Tema;

import java.util.List;

public class CursoTemaDTO {
    private String nombreCurso;
    private List<Tema> listaTema;

    public CursoTemaDTO() {
    }

    public CursoTemaDTO(String nombreCurso, List<Tema> listaTema) {
        this.nombreCurso = nombreCurso;
        this.listaTema = listaTema;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public List<Tema> getListaTema() {
        return listaTema;
    }

    public void setListaTema(List<Tema> listaTema) {
        this.listaTema = listaTema;
    }
}
