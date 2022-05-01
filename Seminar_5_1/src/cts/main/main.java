package cts.main;

import cts.adapter.adapter;
import cts.validatorTerestru.validatorAutobuz;
import cts.validatorTerestru.validatorTerestru;

public class main {
    public static void main(String[] args) {
        validatorTerestru validatorAutobuz = new validatorAutobuz();
        validatorAutobuz.valideazaBilete();
        validatorAutobuz.valideazaAbonament();

        validatorTerestru validatorMetrou = new adapter();
        validatorMetrou.valideazaBilete();
        validatorMetrou.valideazaAbonament();
    }
}
