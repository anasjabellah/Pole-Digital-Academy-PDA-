package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@TableGenerator(name = "Activite")
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "Titre")
    private  String Titre ;
    @Column(name = "Descriptif")
    private  String Descriptif ;
    @Column(name = "Type")
    private  String Type;
    @Column(name = "statut")
    private  String statut ;
    @Column(name = "DateDebut")
    private  Date DateDebut ;
    @Column(name = "DateDeFin")
    private  Date DateDeFin ;
    @Column(name = "responsableID")
    @ManyToOne
    private  Responsable responsable ;


    public Activite(Long id, String titre, String descriptif, String type, String statut, Date dateDebut, Date dateDeFin, Responsable responsable) {
        this.id = id;
        this.Titre = titre;
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
        return Titre;
    }

    public void setTitre(String titre) {
        this.Titre = titre;
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

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.DateDebut = dateDebut;
    }

    public Date getDateDeFin() {
        return DateDeFin;
    }

    public void setDateDeFin(Date dateDeFin) {
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
