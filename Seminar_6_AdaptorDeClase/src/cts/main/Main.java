package cts.main;

import cts.adapter.Adaptor;
import cts.validatorTerestru.ValidatorAutobuz;
import cts.validatorTerestru.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        validatorAutobuz.valideazaBilete();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou = new Adaptor();
        validatorMetrou.valideazaBilete();
        validatorMetrou.valideazaAbonament();
    }
}
