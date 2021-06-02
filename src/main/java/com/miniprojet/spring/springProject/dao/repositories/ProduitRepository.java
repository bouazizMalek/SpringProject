package com.miniprojet.spring.springProject.dao.repositories;

import com.miniprojet.spring.springProject.dao.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long>{

}
