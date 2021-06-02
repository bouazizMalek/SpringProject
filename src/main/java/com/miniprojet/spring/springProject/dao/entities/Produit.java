package com.miniprojet.spring.springProject.dao.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Produit {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private Integer codeprod;

    private String Categorie;
    private Integer quantite;
    @ManyToOne
    @JsonProperty(access = Access.WRITE_ONLY)
    private Commande commande;
 public Produit(){}
    public Produit(Long id, Integer codeprod, String categorie, Integer quantite, Commande commande) {
        this.id = id;
        this.codeprod = codeprod;
        Categorie = categorie;
        this.quantite = quantite;
        this.commande = commande;
    }
}
