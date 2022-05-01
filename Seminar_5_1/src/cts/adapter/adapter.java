package cts.adapter;

import cts.validatorSubteran.validatorMetrou;
import cts.validatorTerestru.validatorTerestru;

public class adapter extends validatorMetrou implements validatorTerestru {
    @Override
    public void valideazaBilete() {
        super.valideazaCalatorii();
    }
}
