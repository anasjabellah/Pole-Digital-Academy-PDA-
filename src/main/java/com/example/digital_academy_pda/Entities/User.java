package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

@Entity
@TableGenerator(name = "User")
public class User {
    // This tells Hibernate to make a table out of this class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom ;
    private String prenom ;
    private String email ;
    private String telephone ;

    @ManyToOne
    private Role role ;

    public User(String nom, String prenom, String email, String telephone, Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.role = role;
    }

    public User() {

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
