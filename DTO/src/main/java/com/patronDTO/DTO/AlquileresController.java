package com.patronDTO.DTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        //supongamos que obtenemos una propiedad por su id y su inquilino
        //desde una base de datos
        Inquilino inqui = new Inquilino(1L,"1234567","walter","white","Profesor");
        Propiedad prop = new Propiedad(152365L,"Casa","308 Negra Arroyo Lane",200.0,40000.0);

        PropiedadDTO propiDTO = new PropiedadDTO();
        //ahora unificamos los datos del inquilino y de la propiedad en solo objeto
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_Propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());

        return propiDTO;
    }
}
