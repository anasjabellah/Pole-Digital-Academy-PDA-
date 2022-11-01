package com.example.digital_academy_pda.Entities;

import java.util.Date;

public class Exercice {

    private Date Annee ;
    private  Date  DateDebut ;
    private  Date DateDeFin ;
    private  String statut ;


    public Exercice(Date annee, Date dateDebut, Date dateDeFin, String statut) {
        this.Annee = annee;
        this.DateDebut = dateDebut;
        this.DateDeFin = dateDeFin;
        this.statut = statut;
    }

    public Date getAnnee() {
        return Annee;
    }

    public void setAnnee(Date annee) {
        this.Annee = annee;
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
}
