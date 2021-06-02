package com.miniprojet.spring.springProject.controller;

import com.miniprojet.spring.springProject.dao.entities.Client;
import com.miniprojet.spring.springProject.dao.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienController {

    @Autowired
    ClientRepository clientRepository;


    @GetMapping("/client")
    public List<Client> getAllCLient(){
        return  clientRepository.findAll();
    }
    @PostMapping("/client")
    public void addCommande(@RequestBody  Client client){

        clientRepository.save(client);
    }
    @DeleteMapping("/client/{id}")
    public void deleteCommande(@PathVariable Long id){
        Client c= clientRepository.findAllById(id);
        clientRepository.delete(c);
    }
    @PostMapping("client/{id}")
    public void updeteClient( @PathVariable Long id, String nom , String prenom, String Email, int telephone, String adresse) {
        Client c = clientRepository.findAllById(id);
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setEmail(Email);
        c.setTelephone(telephone);
        c.setAdresse(adresse);
        clientRepository.save(c);
    }
}
