package com.miniprojet.spring.springProject.dao.service;


import com.miniprojet.spring.springProject.dao.entities.Client;
import com.miniprojet.spring.springProject.dao.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> findAll() {
        return repository.findAll();
    }
}
