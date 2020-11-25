package com.solticss.curso.controller;

import com.solticss.curso.model.entity.Persona;
import com.solticss.curso.repository.IPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IPersonaRepository personaRepository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required=false, defaultValue="World") String name, Model model) {

        Persona p = new Persona();
        p.setId(1);
        p.setNombre("Juancho");
        personaRepository.save(p);
        
        model.addAttribute("name", p.getNombre());
        return "greeting";        
    }
    
}
