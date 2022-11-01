package com.example.digital_academy_pda.Entities;

public class Responsable extends User {
    private String Domaine ;
    private String Type ;


    public Responsable(String nom, String prenom, String email, String telephone, String domaine, String type) {
        super(nom, prenom, email, telephone);
        this.Domaine = domaine;
        this.Type = type;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String domaine) {
        this.Domaine = domaine;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }
}
