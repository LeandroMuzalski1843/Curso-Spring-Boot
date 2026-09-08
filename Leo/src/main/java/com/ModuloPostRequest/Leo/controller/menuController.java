package com.ModuloPostRequest.Leo.controller;

import com.ModuloPostRequest.Leo.model.MenuEjercicio1;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class menuController {

    @GetMapping("/menu")
    @ResponseBody
    //funciona pero mejor practica es ocupar PathVariable
    public MenuEjercicio1 buscarMenu (@RequestParam int numeroPlato){
        List<MenuEjercicio1> Menu = new ArrayList<>();
        Menu.add(new MenuEjercicio1(1,"capeletinis",123,"Son de carne"));
        Menu.add(new MenuEjercicio1(2,"capeletinis",123,"Son de pollo"));
        Menu.add(new MenuEjercicio1(3,"capeletinis",123,"Son de ricota"));

        for (MenuEjercicio1 plato: Menu){
            if(plato.getNumeroPlato() == numeroPlato){
                return plato;
            }
        }
        return null;
    }
}
