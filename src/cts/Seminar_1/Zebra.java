package cts.Seminar_1;

public class Zebra extends Animal{
    public Zebra(String nume) {
        super(nume);
    }

    @Override
    void mananca(String hrana) {
        System.out.println("Girafa " + getNume() + " a mancat " + hrana);
    }
}
