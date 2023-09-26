package org.example.pojo;

public class Garage {

    String nom;
    String adresse;
    Integer nbPlaceVoiture;

    public Garage(String nom, String adresse, Integer nbPlaceVoiture) {
        this.nom = nom;
        this.adresse = adresse;
        this.nbPlaceVoiture = nbPlaceVoiture;
    }

    public Garage() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getNbPlaceVoiture() {
        return nbPlaceVoiture;
    }

    public void setNbPlaceVoiture(Integer nbPlaceVoiture) {
        this.nbPlaceVoiture = nbPlaceVoiture;
    }

    @Override
    public String toString() {
        return "Le garage s'appelle " + nom + ", son adresse est " + adresse + ", le nombre de Place de Voitures est " + nbPlaceVoiture + ".";
    }



}
