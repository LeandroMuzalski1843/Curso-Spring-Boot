package com.RepositoryService.RepositoryService.Service;

import com.RepositoryService.RepositoryService.model.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServide implements IPersonaServide{
    @Override
    public void crearPersona(Persona per){
        //logica de creacion
        System.out.println("Persona Creada");
    }

    @Override
    public List<Persona> traerPersona(){
        //aca buscariamos todas las personas para devolver

        return null; //aca devolveriamos la lista de personas (no null)
    }





}
