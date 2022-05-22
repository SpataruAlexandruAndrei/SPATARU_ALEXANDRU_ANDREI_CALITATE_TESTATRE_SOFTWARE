package cts.Seminar_4_FactoryMethod;

public abstract class MijlocTransportComun {
    String nrInmatriculare;

    public MijlocTransportComun(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}