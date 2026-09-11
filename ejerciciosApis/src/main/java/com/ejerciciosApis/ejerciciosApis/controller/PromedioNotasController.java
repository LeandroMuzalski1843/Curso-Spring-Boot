package com.ejerciciosApis.ejerciciosApis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromedioNotasController {

    @GetMapping("/notas")
    @ResponseBody
    public String notas (@RequestParam String materia, double not1,double not2,double not3){

        return "El promedio de la materia " + materia + " es: "+ (not1+not2+not3)/3 + ", notas (" + not1 + ", "+not2 + ", "+not3 + ")";
    }
}
