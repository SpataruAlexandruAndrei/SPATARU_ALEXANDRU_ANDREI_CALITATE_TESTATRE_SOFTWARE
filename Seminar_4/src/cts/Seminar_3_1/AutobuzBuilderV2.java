package cts.Seminar_3_1;

public class AutobuzBuilderV2 implements Builder{
    private String model;
    private String numeSofet;
    private String numarInmatriculare;
    private boolean stop;
    private boolean openDoors;
    private String text;
    private String nrLinie;

    public AutobuzBuilderV2() {
        model = "Mercedes";
        numeSofet = "Dorel";
        numarInmatriculare = "B-555-STB";
        stop = true;
        openDoors = true;
        text = "Bun venit!";
        nrLinie = "555";
    }


    @Override
    public Autobuz build() {
        return new Autobuz(model, numeSofet, numarInmatriculare, stop, openDoors, text, nrLinie);
    }

    public AutobuzBuilderV2 setModel(String model){
        this.model = model;
        return this;
    }
    public AutobuzBuilderV2 setNumeSofer(String NumeSofer){
        this.numeSofet = NumeSofer;
        return this;
    }

    public AutobuzBuilderV2 setNumarInmatriculare(String numarInmatriculare){
        this.numarInmatriculare = numarInmatriculare;
        return this;
    }
    public AutobuzBuilderV2 setStop(boolean stop){
        this.stop = stop;
        return this;
    }
    public AutobuzBuilderV2 setOpenDoors(boolean openDoors){
        this.openDoors = openDoors;
        return this;
    }
    public AutobuzBuilderV2 setText(String text){
        this.text = text;
        return this;
    }
    public AutobuzBuilderV2 setNrLinie(String nrLinie){
        this.nrLinie = nrLinie;
        return this;
    }
}
