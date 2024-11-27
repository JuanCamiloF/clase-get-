package com.proyecto.proyecto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/saludo")
public class Saludo {
   
    @GetMapping("/hola")
   public String saludo(){
        return "buenos dias ..";
   }

   @GetMapping("/mundo")
   public String mundo(){
        return "querido amigo ";
   }



}

