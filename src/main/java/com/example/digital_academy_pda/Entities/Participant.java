package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

@Entity
@TableGenerator(name = "Participant")
public class Participant extends  User{

    @Column(name = "Domaine")
    private String Domaine ;
    @Column(name = "Structure")
    private String Structure ;

    public Participant(String nom, String prenom, String email, String telephone, Role role,  String domaine, String structure) {
        super(nom, prenom, email, telephone, role);
        this.Domaine = domaine;
        this.Structure = structure;
    }

    public Participant() {

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
