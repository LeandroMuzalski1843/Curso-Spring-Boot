package com.EjerciciosRelaciones.EjerciciosRelaciones.service;

import com.EjerciciosRelaciones.EjerciciosRelaciones.dto.CursoTemaDTO;
import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Curso;
import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Tema;

import java.time.LocalDate;
import java.util.List;

public interface ICursoService {

    //Metodo para Curso

    //lectura
    public List<Curso>getCursos();

    //Alta
    public void saveCurso(Curso curso);

    //Baja
    public void deleteCurso(Long id_curso);

    //Lectura de un solo objeto
    public Curso findCurso(Long id_curso);

    //Edición
    public void editCurso(Curso curso);

    //Tema por Curso
    public CursoTemaDTO temasPorCurso(Long id_curso);

    //Curso de Java
    public List<Curso> getCursosJava();
}
