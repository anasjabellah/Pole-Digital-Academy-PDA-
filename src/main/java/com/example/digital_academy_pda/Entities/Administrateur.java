package com.example.digital_academy_pda.Entities;


import jakarta.persistence.*;

@Entity
@TableGenerator(name = "Administrateur")
public class Administrateur  extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    
    private String Login ;
    private String Password ;

    public Administrateur(String nom, String prenom, String email, String telephone, Role role , String login, String password) {
        super(nom, prenom, email, telephone,role);
        Login = login;
        Password = password;
    }

    public Administrateur() {

    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public Long getId() {return id;}

    @Override
    public void setId(Long id) {this.id = id;}
}



