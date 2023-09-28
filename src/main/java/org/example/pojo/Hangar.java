package org.example.pojo;

public class Hangar extends Garage{

    public Hangar (String nomGarage, String adresse, Integer nombrePlace) {
        super(nomGarage, adresse, nombrePlace);
    }

    @Override
    public String toString() {
        return "Le hangar s'appelle " + this.getNom() + ", son adresse est " + this.getAdresse() + ", le nombre de Place de Voitures est " + this.getNbPlaceVoiture() + ".";
    }
}
