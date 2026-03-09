package org.garage;

public class PourcentageReparation {
    private float prctgRepRanger;
    private float prctgRepEvrest;
    private float prctgRepYukon;
    private float prctgRepRam;

    public PourcentageReparation() {
    }

    public PourcentageReparation(float prctgRepEvrest, float prctgRepRam, float prctgRepRanger, float prctgRepYukon) {
        this.prctgRepEvrest = prctgRepEvrest;
        this.prctgRepRam = prctgRepRam;
        this.prctgRepRanger = prctgRepRanger;
        this.prctgRepYukon = prctgRepYukon;
    }


    public float getPrctgRepEvrest() {
        return prctgRepEvrest;
    }

    public void setPrctgRepEvrest(float prctgRepEvrest) {
        this.prctgRepEvrest = prctgRepEvrest;
    }

    public float getPrctgRepRam() {
        return prctgRepRam;
    }

    public void setPrctgRepRam(float prctgRepRam) {
        this.prctgRepRam = prctgRepRam;
    }

    public float getPrctgRepRanger() {
        return prctgRepRanger;
    }

    public void setPrctgRepRanger(float prctgRepRanger) {
        this.prctgRepRanger = prctgRepRanger;
    }

    public float getPrctgRepYukon() {
        return prctgRepYukon;
    }

    public void setPrctgRepYukon(float prctgRepYukon) {
        this.prctgRepYukon = prctgRepYukon;
    }

    @Override
    public String toString() {
        return "PourcentageReparation{" +
                "prctgRepEvrest=" + prctgRepEvrest +
                ", prctgRepRanger=" + prctgRepRanger +
                ", prctgRepYukon=" + prctgRepYukon +
                ", prctgRepRam=" + prctgRepRam +
                '}';
    }
}
