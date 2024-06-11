package com.crudSpringBoot.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudSpringBoot.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer> {

}
