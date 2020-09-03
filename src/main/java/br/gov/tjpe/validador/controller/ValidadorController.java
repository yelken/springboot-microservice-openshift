package br.gov.tjpe.validador.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ValidadorController {

    @RequestMapping("/isAjuizarProcesso")
    public Boolean index() {
        Random random = new Random();
        return random.nextBoolean();
    }
    
    @RequestMapping("/getNome")
    public String getNome() {
        return "Eventdriven";
    }
}
