package org.example.pojo;

public class Modele {
    Marque marque;
    String nomModele;


    public Modele(Marque marque, String nomModele) {
        this.marque = marque;
        this.nomModele = nomModele;
    }

    public Modele() {
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getNomModele() {
        return nomModele;
    }

    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }

    @Override
    public String toString() {
        return "Modele{" +
                "marque=" + marque +
                ", nomModele='" + nomModele + '\'' +
                '}';
    }
}
