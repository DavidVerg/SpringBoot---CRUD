package com.prueba.CrudSpringBoot.interfaces;

import com.prueba.CrudSpringBoot.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona extends CrudRepository<Persona, Integer> {
}
