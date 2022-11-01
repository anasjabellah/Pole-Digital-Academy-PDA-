package com.example.digital_academy_pda.Entities;

import java.util.Date;

public class Activite {

    private  String Titre ;
    private  String Descriptif ;
    private  String Type;
    private  String statut ;
    private  Date DateDebut ;
    private  Date DateDeFin ;
    private  Responsable responsable ;


    public Activite(String titre, String descriptif, String type, String statut, Date dateDebut, Date dateDeFin, Responsable responsable) {
        this.Titre = titre;
        this.Descriptif = descriptif;
        this.Type = type;
        this.statut = statut;
        this.DateDebut = dateDebut;
        this.DateDeFin = dateDeFin;
        this.responsable = responsable;
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
}
