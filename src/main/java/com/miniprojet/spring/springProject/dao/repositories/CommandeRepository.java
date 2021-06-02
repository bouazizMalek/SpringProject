package com.miniprojet.spring.springProject.dao.repositories;

import com.miniprojet.spring.springProject.dao.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    @Query("select c from Commande c where c.client = :x")
    public List<Commande> listCommandeParClient(@Param("x") Long id);

}
