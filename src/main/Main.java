package main;

import cts.Seminar_1.Girafa;
import cts.Seminar_1.IngrijitorZOO;
import cts.Seminar_1.ZOO;
import cts.Seminar_1.Zebra;

public class Main {
    public static void main(String[] args) {
        IngrijitorZOO ingrijitorZOO = new IngrijitorZOO("Alex");
        ZOO gradinaMea = new ZOO("Zoo", ingrijitorZOO);
        Girafa g1 = new Girafa("g1");
        Zebra z1 = new Zebra("z1");

        gradinaMea.addAnimal(g1);
        gradinaMea.addAnimal(z1);

        gradinaMea.hranesteAnimale();
    }
}
