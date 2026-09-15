package com.JPA.JPA.controller;

import com.JPA.JPA.model.Mascota;
import com.JPA.JPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    // Inyectamos automáticamente una implementación de IMascotaService.
    @Autowired
    private IMascotaService mascotaServ;

    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascotaServ.saveMascota(masco);

        return "La mascota fue creada correctamente";
    }

}
