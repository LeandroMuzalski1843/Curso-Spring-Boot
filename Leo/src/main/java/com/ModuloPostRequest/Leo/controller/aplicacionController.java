package com.ModuloPostRequest.Leo.controller;

import com.ModuloPostRequest.Leo.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class aplicacionController {

    //Solo para probar si funca bien la web jajajaj
    @GetMapping("/hola")
    public String clienteHola(){
        return "Hola como estas mi loco";
    }

    //se va a ejecutar si recibe una solicitud POST
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cli){
        System.out.println("Cliente creado");
        System.out.println("Nombre: "+cli.getNombre());
        System.out.println("Apellido: "+cli.getApellido());
    }

    @GetMapping("/cliente/traer")
    @ResponseBody //para devolver los datos dentro del cuerpo del body
    public List<Cliente> traerCliente(){
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente.add(new Cliente(3L,"Leandro","Muzalski"));
        listaCliente.add(new Cliente(4L,"Cristian","Muzalski"));
        listaCliente.add(new Cliente(5L,"Simón","Muzalski"));

        return listaCliente;
    }

    @GetMapping ("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK);
    }
}
