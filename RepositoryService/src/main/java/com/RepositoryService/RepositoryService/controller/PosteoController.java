package com.RepositoryService.RepositoryService.controller;

import com.RepositoryService.RepositoryService.model.Posteo;
import com.RepositoryService.RepositoryService.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PosteoController {
    //El autowired inyecta la depedencia
    //si necesidad de crear un nuevo objeto

    @Autowired
    PosteoRepository repository;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return repository.traerTodos();
    }
}
