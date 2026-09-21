package com.EjerciciosRelaciones.EjerciciosRelaciones.service;

import com.EjerciciosRelaciones.EjerciciosRelaciones.dto.CursoTemaDTO;
import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Curso;
import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Tema;
import com.EjerciciosRelaciones.EjerciciosRelaciones.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = cursoRepository.findAll();
        return listaCursos;
    }

    @Override
    public void saveCurso(Curso curso) {
        if (curso.getListaTemas() != null) {
            for (Tema tema : curso.getListaTemas()) {
                tema.setCurso(curso); //Vincula el objeto curso dentro de cada tema
            }
        }
        cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id_curso) {
        cursoRepository.deleteById(id_curso);
    }

    @Override
    public Curso findCurso(Long id_curso) {
        Curso curso = cursoRepository.findById(id_curso).orElse(null);
        return curso;
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
        CursoTemaDTO curTemDTO = new CursoTemaDTO();
        Curso curso = this.findCurso(id_curso);
        curTemDTO.setNombreCurso(curso.getNombre());
        curTemDTO.setListaTema(curso.getListaTemas());

        return curTemDTO;
    }

    @Override
    public List<Curso> getCursosJava() {
        String palabra = "Java";
        String textoComparar;

        List<Curso>listaCursos = this.getCursos();
        List<Curso>listaCursosJava= new ArrayList<>();

        for (Curso cur : listaCursos) {
            textoComparar = cur.getNombre();
            boolean contieneJava = textoComparar.contains(palabra);
            if (contieneJava == true) {
                listaCursosJava.add(cur);
            }
        }
        return listaCursosJava;
    }


}
