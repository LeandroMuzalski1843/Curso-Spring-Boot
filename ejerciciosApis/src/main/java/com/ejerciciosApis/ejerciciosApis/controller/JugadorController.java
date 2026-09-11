package com.ejerciciosApis.ejerciciosApis.controller;

import com.ejerciciosApis.ejerciciosApis.model.Jugador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JugadorController {
    /*Pasar una lista de objetos completos por URL (GET) no es posible de forma estándar.
    Para enviar datos de objetos/listas, se debe usar la anotación @PostMapping enviando un cuerpo
    de petición (@RequestBody)
     */
    @PostMapping("/jugadores")
    public String alturaJugadores (@RequestBody List<Jugador> listaJugadores){

        double totalAltura = 0.0;
        double promedio = 0.0;

        List<Jugador> jugador = new ArrayList<>();
       jugador = listaJugadores;

       for (Jugador jug : jugador){
           totalAltura = totalAltura + jug.getAltura();
       }
       promedio = totalAltura / jugador.size();

       return "Jugadores registrados correctamente. El promedio de estatura de los mismos es: " + promedio;

    }
}
