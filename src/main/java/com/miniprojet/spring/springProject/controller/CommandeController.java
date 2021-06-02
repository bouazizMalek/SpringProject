package com.miniprojet.spring.springProject.controller;


import com.miniprojet.spring.springProject.dao.entities.Client;
import com.miniprojet.spring.springProject.dao.entities.Commande;
import com.miniprojet.spring.springProject.dao.repositories.ClientRepository;
import com.miniprojet.spring.springProject.dao.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeController {
    @Autowired
    CommandeRepository cr;
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/commande/{id}")
    public List<Commande> listProd(@PathVariable Long id) {
        return cr.listCommandeParClient(id);
    }
    @GetMapping("/commande")
    public List<Commande> getAllCommande(){
        return  cr.findAll();
    }
    @PostMapping("/commonde/{id}")
    public void addCommande(@PathVariable Long id){
        Client c = clientRepository.findAllById(id);

    }
    @DeleteMapping("/commande/{idCmd}")
    public void deleteCommande(@PathVariable Long idCmd){
        Commande c = cr.getById(idCmd);
        cr.delete(c);
    }
    }
