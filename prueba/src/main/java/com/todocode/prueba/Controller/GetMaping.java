package com.todocode.prueba.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetMaping {


    @GetMapping ///si se hace una solicitud mediante un get, devuelve esto
    public String sayHe(){
        return "Hello Wold!";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Wold!... Esooooo";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Goodbye World";
    }

    //GetMapping con parametro
    @GetMapping("hello/{nombre}")
    public String sayhello (@PathVariable String nombre){
        return "Hello " + nombre;
    }

    @GetMapping("hello/{nombre}/{edad}/{profesion}")
    public String sayHelloComplete (@PathVariable String nombre,
                                    @PathVariable int edad,
                                    @PathVariable String profesion){
        return "Hello World. Tu nombre es " + nombre +
                " .Edad: " + edad +
                " .Profesión " + profesion;
    }

    //RequestParam
    //http://localhost:8080/hola?nombre=Leandro&edad=23&profesion=Analista%20en%20sistemas
    //va el nombre /hola, despues el ? que simboliza que vlas variables
    //luego nobre de la variable y luego el valor
    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,
                             @RequestParam int edad,
                             @RequestParam String profesion){
        return "Hello World, Tu nombre es: " + nombre +
                " Tu edad es: " + edad +
                " Tu profesion es: " + profesion;
    }


    //Ejercicios
    //1)suma de dos numeros con pathVariable
    @GetMapping("suma/{numero1}/{numero2}")
    public String Suma(@PathVariable int numero1,
                    @PathVariable int numero2){
        return "La suma de "+ numero1 + " + " + numero2 + " es: " + (numero1+numero2);
    }

    //2) Ingreso de Peso segun el IMC
    @GetMapping("/IMC")
    public String Peso(@RequestParam float peso){
        String rango="";
        if (peso>=1 && peso<=18.5){
            rango = "Peso insuficiente";
        } else if (peso >= 18.6 && peso <= 24.9) {
            rango = "Peso normal";
        }else if (peso >= 25.0 && peso <= 29.9) {
            rango = "Sobrepeso";
        }else if (peso >= 30) {
            rango = "Obesidad";
        }
        return rango;
    }

    //3)
    @GetMapping("/conversion/{galon}")
    public String Conversion(@PathVariable double galon){
        return "la cantidad de " + galon + " galones equivale a " + galon*3.78541 + " litros";
    }

}
