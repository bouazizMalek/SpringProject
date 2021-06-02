package com.miniprojet.spring.springProject.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private String prenom;

    @Column(unique = true)
    private String email;

    private int telephone;
    private String adresse;

    @OneToMany(mappedBy = "client")
    private List<Commande> posts = new ArrayList<>();
    public Client(){}
    public Client(Long id, String nom, String prenom, String email, int telephone, String adresse, List<Commande> posts) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Commande> getPosts() {
        return posts;
    }

    public void setPosts(List<Commande> posts) {
        this.posts = posts;
    }
}

