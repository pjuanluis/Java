package com.solticss.curso.controller;

import java.util.List;

import com.solticss.curso.model.entity.Persona;
import com.solticss.curso.repository.IPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaRestController {

    @Autowired
    private IPersonaRepository personaRepository;


    @GetMapping()
    public ResponseEntity<List<Persona>> listar(){
        ResponseEntity<List<Persona>> res = new ResponseEntity<>(personaRepository.findAll() ,HttpStatus.OK);
        return res;
    }

    @PostMapping()
    public ResponseEntity<Persona> insertar(@RequestBody Persona persona){
        personaRepository.save(persona);
        ResponseEntity<Persona> res = new ResponseEntity<>(persona, HttpStatus.CREATED);
        return res;
    }


    
}
