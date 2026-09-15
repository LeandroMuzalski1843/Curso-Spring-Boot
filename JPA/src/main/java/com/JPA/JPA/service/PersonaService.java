package com.JPA.JPA.service;

import com.JPA.JPA.model.Persona;
import com.JPA.JPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        personaRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        //acá si no encuentro la persona, devuelvo null por eso va el orELse
        Persona perso = personaRepository.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        Persona perso = this.findPersona(idOriginal);

        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);

        this.savePersona(perso);
    }

    @Override
    public void editPersona(Persona per) {
        this.savePersona(per);
    }


}
