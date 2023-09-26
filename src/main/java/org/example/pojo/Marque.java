package org.example.pojo;

public class Marque {

    String nomMarque;

    public Marque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    public Marque() {
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    @Override
    public String toString() {
        return "Marque{" +
                "nomMarque='" + nomMarque + '\'' +
                '}';
    }
}
