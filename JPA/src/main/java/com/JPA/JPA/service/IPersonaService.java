package com.JPA.JPA.service;

import com.JPA.JPA.model.Persona;

import java.util.List;

public interface IPersonaService {
    //Método para traer todas las personas
    public List<Persona> getPersonas();

    //Método para dar de alta a una persona
    public void savePersona (Persona perso);

    //Método para borrar una persona
    public void deletePersona (Long id);

    //Método para encontrar una persona
    public Persona findPersona (Long id);

    //Método para editar una persona
    public void editPersona(Long idOriginal,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);
}
