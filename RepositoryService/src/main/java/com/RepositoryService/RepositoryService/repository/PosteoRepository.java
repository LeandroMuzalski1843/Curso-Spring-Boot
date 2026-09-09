package com.RepositoryService.RepositoryService.repository;

import com.RepositoryService.RepositoryService.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository {

    public List<Posteo> traerTodos(){
        List<Posteo> listaPosteos = new ArrayList<>();
        listaPosteos.add(new Posteo(1L,"Como formatear una pc","Leo"));
        listaPosteos.add(new Posteo(2L,"Como formatear una pc","Pola"));
        return listaPosteos;
    }
}
