package cts.Seminar_3_1;

public class Autobuz {
    private String model;
    private String numeSofet;
    private String numarInmatriculare;
    private boolean stop;
    private boolean openDoors;
    private String text;
    private String nrLinie;

    public Autobuz(String model, String numeSofet, String numarInmatriculare, boolean stop, boolean openDoors, String text, String nrLinie) {
        this.model = model;
        this.numeSofet = numeSofet;
        this.numarInmatriculare = numarInmatriculare;
        this.stop = stop;
        this.openDoors = openDoors;
        this.text = text;
        this.nrLinie = nrLinie;
    }

    Autobuz() {
        model = "Mercedes";
        numeSofet = "Dorel";
        numarInmatriculare = "B-555-STB";
        stop = true;
        openDoors = true;
        text = "Bun venit!";
        nrLinie = "555";
    }

    void setModel(String model) {
        this.model = model;
    }

    void setNumeSofet(String numeSofet) {
        this.numeSofet = numeSofet;
    }

    void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    void setStop(boolean stop) {
        this.stop = stop;
    }

    void setOpenDoors(boolean openDoors) {
        this.openDoors = openDoors;
    }

    void setText(String text) {
        this.text = text;
    }

    void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofet='").append(numeSofet).append('\'');
        sb.append(", numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append(", stop=").append(stop);
        sb.append(", openDoors=").append(openDoors);
        sb.append(", text='").append(text).append('\'');
        sb.append(", nrLinie='").append(nrLinie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
