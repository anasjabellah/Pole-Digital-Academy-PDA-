package com.example.digital_academy_pda.Entities;

public class Administrateur  extends User {

    private String Login ;
    private String Password ;

    public Administrateur(String nom, String prenom, String email, String telephone, String login, String password) {
        super(nom, prenom, email, telephone);
        Login = login;
        Password = password;
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
}
