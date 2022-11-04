package com.example.digital_academy_pda.Entities;


import jakarta.persistence.*;

@Entity
@TableGenerator(name = "Administrateur")
public class Administrateur  extends User {

    private String username ;
    private String Password ;

    public Administrateur(String nom, String prenom, String email, String telephone, Role role , String login, String password) {
        super(nom, prenom, email, telephone,role);
        this.username = username;
        this.Password = password;
    }

    public Administrateur() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String login) {
        this.username = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

}



