package com.EjerciciosRelaciones.EjerciciosRelaciones.controller;

import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Tema;
import com.EjerciciosRelaciones.EjerciciosRelaciones.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    private ITemaService temaService;

    //Crear Tema
    @PostMapping("/temas/crear")
    public String crearTema(@RequestBody Tema tema){
        temaService.saveTema(tema);
        return "Tema creado correctamente";
    }

    //Modificar Tema
    @PutMapping("/temas/editar")
    public String editTema(@RequestBody Tema tema){
        temaService.editTema(tema);
        return "Tema editado correctamente";
    }


}
