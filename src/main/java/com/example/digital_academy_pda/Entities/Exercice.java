package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@TableGenerator(name = "Exercice")
public class Exercice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "Title")
    private  String Title ;
    @Column(name = "Annee")
    private String Annee ;
    @Column(name = "DateDebut")
    private  String  DateDebut ;
    @Column(name = "DateDeFin")
    private  String DateDeFin ;

    @ManyToOne
    private  Activite activite ;


    public Exercice(Long id, String title, String annee, String dateDebut, String dateDeFin, Activite activite) {
        this.id = id;
        this.Title = title;
        this.Annee = annee;
        this.DateDebut = dateDebut;
        this.DateDeFin = dateDeFin;
        this.activite = activite ;
    }

    public Exercice() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String annee) {
        Annee = annee;
    }

    public String getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(String dateDebut) {
        DateDebut = dateDebut;
    }

    public String getDateDeFin() {
        return DateDeFin;
    }

    public void setDateDeFin(String dateDeFin) {
        DateDeFin = dateDeFin;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }
}
