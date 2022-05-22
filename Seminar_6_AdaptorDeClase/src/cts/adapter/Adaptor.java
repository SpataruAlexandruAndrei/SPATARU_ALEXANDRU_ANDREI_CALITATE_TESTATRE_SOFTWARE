package cts.adapter;

import cts.validatorSubteran.ValidatorMetrou;
import cts.validatorTerestru.ValidatorTerestru;

public class Adaptor extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilete() {
        super.valideazaCalatorii();
    }
}
