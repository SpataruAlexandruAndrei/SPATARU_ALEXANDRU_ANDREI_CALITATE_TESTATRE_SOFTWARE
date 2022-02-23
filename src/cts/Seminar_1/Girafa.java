package cts.Seminar_1;

public class Girafa extends Animal{

    public Girafa(String nume) {
        super(nume);
    }

    @Override
    void mananca(String hrana) {
        System.out.println("Girafa " + getNume() + " a mancat " + hrana);
    }
}
