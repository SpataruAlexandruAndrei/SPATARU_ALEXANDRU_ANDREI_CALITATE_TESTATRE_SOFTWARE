package Teste.Dubluri;

import clase.iPachetTuristic;

public class PachetDummy implements iPachetTuristic {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int pprocent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
