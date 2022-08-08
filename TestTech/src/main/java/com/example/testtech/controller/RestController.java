package com.example.testtech.controller;


import com.example.testtech.entity.Inventaire;
import com.example.testtech.service.Inventaires;
import com.example.testtech.service.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    Inventaires inventaires;


    @RequestMapping("/inventaire")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/inventaire/{id}")
    public Inventaire getInventaire(@PathVariable int id) {
        Optional<Inventaire> proposal =inventaires.findById(id);
// gérer l'absence de proposal
        if(!proposal.isPresent())
            throw new NotFoundException("proposal doesn't exists");


        return proposal.get();
        //TODO ajouter la doc swagger
//Test JUNIt
    }
}
