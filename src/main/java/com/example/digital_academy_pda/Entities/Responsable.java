package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

@Entity
@TableGenerator(name = "Responsable")
public class Responsable  extends User{


    @Column(name = "Domaine")
    private  String Domaine ;
    @Column(name = "Type")
    private  String Type ;

    @Column(name = "Etat")
    private  String Etat ;

    public Responsable(String nom, String prenom, String email, String telephone, Role role, String domaine, String type,String Etat) {
        super(nom, prenom, email, telephone, role);
        this.Domaine = domaine;
        this.Type = type;
        this.Etat = Etat ;
    }


    public Responsable() {

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

    public String getEtat() {return Etat;}

    public void setEtat(String etat) {Etat = etat;}
}
