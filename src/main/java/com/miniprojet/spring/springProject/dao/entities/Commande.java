package com.miniprojet.spring.springProject.dao.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Commande {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private Integer num_com;

    private Date date_com;

    @ManyToOne
    @JsonProperty(access = Access.WRITE_ONLY)
    private Client client;
    @OneToMany(mappedBy = "commande" ,fetch=FetchType.EAGER , cascade = CascadeType.ALL)
    private List<Produit> produit;

    public Commande(){}
    public Commande(Long id, Integer num_com, Date date_com, Client client, List<Produit> produit) {
        this.id = id;
        this.num_com = num_com;
        this.date_com = date_com;
        this.client = client;
        this.produit = produit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNum_com() {
        return num_com;

    }

    public void setNum_com(Integer num_com) {
        this.num_com = num_com;
    }

    public Date getDate_com() {
        return date_com;
    }

    public void setDate_com(Date date_com) {
        this.date_com = date_com;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
}
