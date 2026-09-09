package com.RepositoryService.RepositoryService.Service;

import com.RepositoryService.RepositoryService.model.Persona;

import java.util.List;

public interface IPersonaServide {

    public void crearPersona(Persona per);
    public List<Persona> traerPersona();
}
