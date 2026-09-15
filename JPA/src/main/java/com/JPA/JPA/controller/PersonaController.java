package com.JPA.JPA.controller;

import com.JPA.JPA.model.Persona;
import com.JPA.JPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;

    //EndPoint para obtener todas las personas
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return interPersona.getPersonas();
    }

    //EndPoint para crear una nueva persona
    @PostMapping("/personas/crear")
    public String createStudents(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        //devuelve un string avisando si creo correctamente
        return "La persona fue creada correctamente";
    }

    //EndPoint para dar de baja una nueva persona
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        interPersona.deletePersona(id);
        //devuelve un string avisando si elimino correctamente
        return "La persona fue eliminada correctamente";
    }

    //EndPoint para modificar una persona
    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(
            @PathVariable Long id_original,
            @RequestParam(required = false, name = "nombre") String nuevoNombre,
            @RequestParam(required = false, name = "apellido") String nuevoApellido,
            @RequestParam(required = false, name = "edad") int nuevaEdad) {

        //Envio id original (para buscar)
        //Envio nuevos datos para modificar
        interPersona.editPersona(
                id_original,
                nuevoNombre,
                nuevoApellido,
                nuevaEdad
        );

        //busco la persona editada para mostrarla en la response
        //retorna la nueva persona
        return interPersona.findPersona(id_original);
    }

    @PutMapping ("/personas/editar")
    public Persona editPersona(@RequestBody Persona per){
        interPersona.editPersona(per);
        return interPersona.findPersona(per.getId());
    }

}

