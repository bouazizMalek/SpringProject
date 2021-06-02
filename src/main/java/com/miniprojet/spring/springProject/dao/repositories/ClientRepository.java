package com.miniprojet.spring.springProject.dao.repositories;

import com.miniprojet.spring.springProject.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
  public Client findAllById(Long id);

}
