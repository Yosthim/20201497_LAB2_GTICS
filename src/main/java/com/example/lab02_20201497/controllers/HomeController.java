package com.example.lab02_20201497.controllers;

import com.example.lab02_20201497.dataClasses.DatosJuego;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @GetMapping(value = "/buscaminas")
    public String configurarJuego() {
        return "configurarJuego";
    }
    @PostMapping(value = "/jugar")
    public String jugar(DatosJuego datosJuego) {

        return "juego";
    }
}
