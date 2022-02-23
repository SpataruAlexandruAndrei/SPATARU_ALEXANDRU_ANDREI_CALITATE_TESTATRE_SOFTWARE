package cts.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitor;
    private List<Animal> animale;

    public ZOO(String nume, IngrijitorZOO ingrijitor) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = new ArrayList<Animal>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(IngrijitorZOO ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public void addAnimal(Animal a){
        animale.add(a);
    }

    public void hranesteAnimale(){
        animale.forEach(animal -> ingrijitor.hranesteAnimal(animal, "iarba"));
    }
}
