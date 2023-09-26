package org.example.pojo;

public class Voiture {

    String immatriculation;
    Modele modele;

    Motorisation motorisation;
    Integer nombrePorte;

    public Voiture(String immatriculation, Modele modele, Motorisation motorisation, Integer nombrePorte) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.motorisation = motorisation;
        this.nombrePorte = nombrePorte;
    }

    public Voiture() {
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public Motorisation getMotorisation() {
        return motorisation;
    }

    public void setMotorisation(Motorisation motorisation) {
        this.motorisation = motorisation;
    }

    public Integer getNombrePorte() {
        return nombrePorte;
    }

    public void setNombrePorte(Integer nombrePorte) {
        this.nombrePorte = nombrePorte;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "immatriculation='" + immatriculation + '\'' +
                ", modele=" + modele +
                ", motorisation=" + motorisation +
                ", nombrePorte=" + nombrePorte +
                '}';
    }
}
