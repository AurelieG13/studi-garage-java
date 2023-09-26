package org.example.pojo;

public class Motorisation {

    Carburant typeCarburant;
    Integer nombreChevaux;

    public Motorisation(Carburant typeCarburant, Integer nombreChevaux) {
        this.typeCarburant = typeCarburant;
        this.nombreChevaux = nombreChevaux;
    }

    public Motorisation() {
    }

    public Carburant getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(Carburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public Integer getNombreChevaux() {
        return nombreChevaux;
    }

    public void setNombreChevaux(Integer nombreChevaux) {
        this.nombreChevaux = nombreChevaux;
    }

    @Override
    public String toString() {
        return "Motorisation{" +
                "typeCarburant=" + typeCarburant +
                ", nombreChevaux=" + nombreChevaux +
                '}';
    }
}
