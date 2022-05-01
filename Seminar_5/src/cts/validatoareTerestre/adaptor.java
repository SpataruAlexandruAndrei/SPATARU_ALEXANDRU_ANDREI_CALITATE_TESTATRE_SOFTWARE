package cts.validatoareTerestre;

import cts.validatoareSubterane.validatorMetrou;
import cts.validatoareSubterane.validatorSubteran;

public class adaptor implements validatorTerestru{
    validatorSubteran validatorMetrou;

    public adaptor(validatorSubteran validatorMetrou) {
        super();
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilete() {
        validatorMetrou.valideazaCalatorii();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
