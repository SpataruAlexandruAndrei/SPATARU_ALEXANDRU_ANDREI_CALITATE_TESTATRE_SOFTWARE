package cts.Seminar_4;

public abstract class MijlocTransport implements Cloneable{
    private String nuamrInmatriculare;

    public MijlocTransport(String nuamrInmatriculare) {
        this.nuamrInmatriculare = nuamrInmatriculare;
    }

    public String getNuamrInmatriculare() {
        return nuamrInmatriculare;
    }

    public void setNuamrInmatriculare(String nuamrInmatriculare) {
        this.nuamrInmatriculare = nuamrInmatriculare;
    }

    public abstract MijlocTransport copiaza() throws CloneNotSupportedException;
}
