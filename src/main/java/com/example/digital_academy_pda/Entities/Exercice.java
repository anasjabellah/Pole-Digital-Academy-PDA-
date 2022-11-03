package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@TableGenerator(name = "Exercice")
public class Exercice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "Annee")
    private Date Annee ;
    @Column(name = "DateDebut")
    private  Date  DateDebut ;
    @Column(name = "DateDeFin")
    private  Date DateDeFin ;
    @Column(name = "statut")
    private  String statut ;

    public Exercice(Long id, Date annee, Date dateDebut, Date dateDeFin, String statut) {
        this.id = id;
        this.Annee = annee;
        this.DateDebut = dateDebut;
        this.DateDeFin = dateDeFin;
        this.statut = statut;
    }

    public Exercice() {}

    public Date getAnnee() {
        return Annee;
    }

    public void setAnnee(Date annee) {
        Annee = annee;
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

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
}
