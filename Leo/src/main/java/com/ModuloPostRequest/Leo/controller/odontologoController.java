package com.ModuloPostRequest.Leo.controller;

import com.ModuloPostRequest.Leo.model.OdontologoEjercicio2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class odontologoController {

    @GetMapping("/pacientes")
    @ResponseBody
    public List<OdontologoEjercicio2> listaPacientes(){
        List<OdontologoEjercicio2> lista = new ArrayList<>();

        lista.add(new OdontologoEjercicio2(1,44772668,"Leandro","Muzalski", LocalDate.of(2003,4,18)));
        lista.add(new OdontologoEjercicio2(2,44772668,"Cristian","Muzalski",LocalDate.of(2005,4,18)));
        lista.add(new OdontologoEjercicio2(3,44772668,"Simón","Muzalski",LocalDate.of(2010,4,18)));

        return lista;
    }

    @GetMapping("/pacientes/menores")
    @ResponseBody
    public List<OdontologoEjercicio2> pacientesMenores(){
        List<OdontologoEjercicio2> lista = new ArrayList<>();
        List<OdontologoEjercicio2> listaMenores = new ArrayList<>();

        lista.add(new OdontologoEjercicio2(1,44772668,"Leandro","Muzalski", LocalDate.of(2003,4,18)));
        lista.add(new OdontologoEjercicio2(2,44772668,"Cristian","Muzalski",LocalDate.of(2005,4,18)));
        lista.add(new OdontologoEjercicio2(3,44772668,"Simón","Muzalski",LocalDate.of(2010,4,18)));

        LocalDate hoy = LocalDate.now();

        for (OdontologoEjercicio2 paciente:lista){
            //calculo período entre fecha de nacimiento del paciente y fecha de hoy
            Period edad = Period.between(paciente.getFechaNacimiento(),hoy);
            if(edad.getYears()<18){
                listaMenores.add(paciente);
            }
        }
        return listaMenores;
    }
}
