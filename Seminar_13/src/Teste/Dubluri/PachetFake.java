package Teste.Dubluri;

import clase.iPachetTuristic;

public class PachetFake implements iPachetTuristic {
    boolean rezervare;
    double pret;

    public void setRezervare(boolean rezervare) {
        this.rezervare = rezervare;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public boolean poateRezerva() {
        return rezervare;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return pret;
    }
}
