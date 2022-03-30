package cts.Seminar_3;

public class Tramvai extends MijlocTransport{
    private String numeVatman;

    public Tramvai(String nuamrInmatriculare, String numeVatman) {
        super(nuamrInmatriculare);
        this.numeVatman = numeVatman;
    }

    public String getNumeVatman() {
        return numeVatman;
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }
}
