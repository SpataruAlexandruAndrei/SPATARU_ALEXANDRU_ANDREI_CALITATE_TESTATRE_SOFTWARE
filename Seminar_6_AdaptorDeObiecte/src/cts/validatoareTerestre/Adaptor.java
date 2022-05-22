package cts.validatoareTerestre;

import cts.validatoareSubterane.ValidatorSubteran;

public class Adaptor implements ValidatorTerestru {
    ValidatorSubteran validatorMetrou;

    public Adaptor(ValidatorSubteran validatorMetrou) {
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
