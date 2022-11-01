package com.example.digital_academy_pda.Entities;

public class Participant extends User {

    private  String Domaine ;
    private  String Structure ;


    public Participant(String nom, String prenom, String email, String telephone, String domaine, String structure) {
        super(nom, prenom, email, telephone);
        this.Domaine = domaine;
        this.Structure = structure;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String domaine) {
        this.Domaine = domaine;
    }

    public String getStructure() {
        return Structure;
    }

    public void setStructure(String structure) {
        this.Structure = structure;
    }
}
