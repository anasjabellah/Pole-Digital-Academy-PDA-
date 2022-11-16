package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@TableGenerator(name = "Activite")
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "Title")
    private  String Title ;
    @Column(name = "Descriptif")
    private  String Descriptif ;
    @Column(name = "Type")
    private  String Type;
    @Column(name = "statut")
    private  String statut ;
    @Column(name = "DateDebut")
    private  String DateDebut;
    @Column(name = "DateDeFin")
    private  String DateDeFin ;
    @ManyToOne
    private  Responsable responsable ;


    public Activite(Long id, String Title, String descriptif, String type, String statut, String dateDebut, String dateDeFin, Responsable responsable) {
        this.id = id;
        this.Title = Title;
        this.Descriptif = descriptif;
        this.Type = type;
        this.statut = statut;
        this.DateDebut = dateDebut;
        this.DateDeFin = dateDeFin;
        this.responsable = responsable;
    }

    public Activite() {

    }

    public String getTitre() {
        return Title;
    }

    public void setTitre(String titre) {
        this.Title = titre;
    }

    public String getDescriptif() {
        return Descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.Descriptif = descriptif;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.DateDebut = dateDebut;
    }

    public String getDateDeFin() {
        return DateDeFin;
    }

    public void setDateDeFin(String dateDeFin) {
        this.DateDeFin = dateDeFin;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
}
