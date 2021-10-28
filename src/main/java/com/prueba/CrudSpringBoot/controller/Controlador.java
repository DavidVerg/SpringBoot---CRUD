package com.prueba.CrudSpringBoot.controller;

import com.prueba.CrudSpringBoot.service.PersonaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reportes")
public class Controlador {

    private final PersonaService personaService;

    public Controlador(PersonaService personaService) {
        this.personaService = personaService;
    }

    public String listar(Model model) {

    }
}
