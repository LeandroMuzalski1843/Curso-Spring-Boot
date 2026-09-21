package com.EjerciciosRelaciones.EjerciciosRelaciones.controller;

import com.EjerciciosRelaciones.EjerciciosRelaciones.dto.CursoTemaDTO;
import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Curso;
import com.EjerciciosRelaciones.EjerciciosRelaciones.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CursoController {
    @Autowired
    private ICursoService interCurso;

    //Traer todos los Cursos
    @GetMapping("/curso/traer")
    public List<Curso> getCursos(){
        return interCurso.getCursos();
    }

    //Crear un curso
    @PostMapping("/curso/crear")
    public String creatCurso(@RequestBody Curso curso){
        interCurso.saveCurso(curso);
        return "Se creo el curso correctamente";
    }

    //Eliminar Curso
    @DeleteMapping("/curso/borrar/{id}")
    public String deleteCurso(@PathVariable Long id){
        interCurso.deleteCurso(id);
        return "El curso fue eliminado correctamente";
    }

    //Editar Curso
    @PutMapping("/curso/editar")
    public Curso editCurso(@RequestBody Curso curso){
        interCurso.editCurso(curso);
        return interCurso.findCurso(curso.getId_curso());
    }

    //Obtener Cursos de Java
    @GetMapping("/curso/java")
    public List<Curso> getCursoJava(){
        return interCurso.getCursosJava();
    }

    //Obtener los temas por curso
    @GetMapping("/curso/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso(@PathVariable Long id_curso){
        return interCurso.temasPorCurso(id_curso);
    }



}
