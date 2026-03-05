package org.garage;

import java.util.Objects;

public class NbrRepationVeh {
    private Marque marque;
    private Modele modele;
    private int nombre_reparation;

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public int getNombre_reparation() {
        return nombre_reparation;
    }

    public void setNombre_reparation(int nombre_reparation) {
        this.nombre_reparation = nombre_reparation;
    }

    public NbrRepationVeh() {
    }

    public NbrRepationVeh(Marque marque, Modele modele, int nombre_reparation) {
        this.marque = marque;
        this.modele = modele;
        this.nombre_reparation = nombre_reparation;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NbrRepationVeh that = (NbrRepationVeh) o;
        return getNombre_reparation() == that.getNombre_reparation() && getMarque() == that.getMarque() && getModele() == that.getModele();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarque(), getModele(), getNombre_reparation());
    }

    @Override
    public String toString() {
        return "NbrRepationVeh{" +
                "marque=" + marque +
                ", modele=" + modele +
                ", nombre_reparation=" + nombre_reparation +
                '}';
    }
}
