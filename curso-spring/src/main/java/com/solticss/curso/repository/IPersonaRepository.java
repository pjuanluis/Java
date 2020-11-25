package com.solticss.curso.repository;

import com.solticss.curso.model.entity.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Integer>{

    
    
}
