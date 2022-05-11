package cts.command;

public class Autobuz {
    private String numarInmatriculare;

    public Autobuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }



    public void pleacaPeTraseu(int linie){
        System.out.println("Autobuzul cu numarul de inmatriculare: " + numarInmatriculare + " a plecat pe linia: " + linie);
    }
}
