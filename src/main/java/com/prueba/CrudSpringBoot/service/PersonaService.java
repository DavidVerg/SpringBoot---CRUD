package com.prueba.CrudSpringBoot.service;

import com.prueba.CrudSpringBoot.interfaceService.IPersonaService;
import com.prueba.CrudSpringBoot.interfaces.IPersona;
import com.prueba.CrudSpringBoot.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
