package com.ClinicaVeterinaria.ClinicaVeterinaria.controller;


import com.ClinicaVeterinaria.ClinicaVeterinaria.dto.MascotaDuenioDTO;
import com.ClinicaVeterinaria.ClinicaVeterinaria.model.Mascota;
import com.ClinicaVeterinaria.ClinicaVeterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    //Treaer todas las mascotas
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascota(){
        return mascotaService.getMascota();
    }

    //Crear Mascota
    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);

        return "Se creo mascota con exito";
    }

    //Eliminar Mascota
    @DeleteMapping("/mascota/elimar/{id}")
    public String deletMascota(@PathVariable Long id){
        mascotaService.deleteMascota(id);
        return "La mascota fue eliminada corretamente";
    }

    //Editar Mascota
    @PutMapping("/mascota/editar")
    public Mascota editMacota(@RequestBody Mascota mascota){
        mascotaService.editMascota(mascota);
        return mascotaService.findMascota(mascota.getId());
    }

    //Traer Mascotas de raza caniche
    @GetMapping("/mascota/traer-caniche")
    public List<Mascota> traerCaniche(){
        return mascotaService.getEspecieRazaMascota();
    }

    //Traer datos convinados de dueño y mascota
    @GetMapping("mascota/duenio")
    public List<MascotaDuenioDTO>traerDuenios(){
        return mascotaService.getMascoDuenios();
    }



}
