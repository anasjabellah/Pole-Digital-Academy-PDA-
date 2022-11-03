package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

@Entity
@TableGenerator(name = "Responsable")
public class Responsable  extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "Domaine")
    private  String Domaine ;
    @Column(name = "Type")
    private  String Type ;


    public Responsable(String nom, String prenom, String email, String telephone, Role role, long id, String domaine, String type) {
        super(nom, prenom, email, telephone, role);
        this.id = id;
        this.Domaine = domaine;
        this.Type = type;
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

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
