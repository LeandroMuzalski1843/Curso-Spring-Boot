package com.EjerciciosRelaciones.EjerciciosRelaciones.service;

import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Curso;
import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Tema;

import java.util.List;

public interface ITemaService {

    //Metodo para Tema

    //lectura
    public List<Tema> getTemas();

    //Alta
    public void saveTema(Tema tema);

    //Baja
    public void deleteTema(Long id_tema);

    //Lectura de un solo objeto
    public Tema findTema(Long id_tma);

    //Edición
    public void editTema(Tema tema);
}
