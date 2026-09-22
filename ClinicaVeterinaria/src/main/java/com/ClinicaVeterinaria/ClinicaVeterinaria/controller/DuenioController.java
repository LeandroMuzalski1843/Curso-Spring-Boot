package com.ClinicaVeterinaria.ClinicaVeterinaria.controller;

import com.ClinicaVeterinaria.ClinicaVeterinaria.model.Duenio;
import com.ClinicaVeterinaria.ClinicaVeterinaria.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService duenioService;

    //Traer todos los Dueños
    @GetMapping("/duenio/traer")
    public List<Duenio> getDuenio(){
        return duenioService.getDuenio();
    }

    //Crear Dueño
    @PostMapping("/duenio/crear")
    public String creatDuenio(@RequestBody Duenio duenio){
        duenioService.saveDuenio(duenio);
        return "El dueño se creo correctamente";
    }

    //Eliminar Dueño
    @DeleteMapping("/duenio/eliminar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        duenioService.deleteDuenio(id);
        return "El dueño fue eliminado";
    }

    //Editar Dueño
    @PutMapping("/duenio/editar")
    public Duenio editDuenio(@RequestBody Duenio duenio){
        duenioService.editDuenio(duenio);
        return duenioService.findDuenio(duenio.getId_duenio());
    }

}
