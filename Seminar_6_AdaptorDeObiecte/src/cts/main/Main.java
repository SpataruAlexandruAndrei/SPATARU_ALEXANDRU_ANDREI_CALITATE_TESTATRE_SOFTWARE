package cts.main;

import cts.validatoareSubterane.ValidatorMetrou;
import cts.validatoareSubterane.ValidatorSubteran;
import cts.validatoareTerestre.Adaptor;
import cts.validatoareTerestre.ValidatorAutobuz;
import cts.validatoareTerestre.ValidatorTerestru;

public class Main {

    public static void valideazaBilet(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilete();
    }

    public static void main(String[] args) {
        ValidatorSubteran validatorMetrou = new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();

        System.out.println("FARA ADAPTOR!!\n");

        valideazaBilet(validatorAutobuz);
        System.out.println();
        //valideazaBilet(validatorMetrou);

        System.out.println("CU ADAPTOR!!\n");

        Adaptor adaptor = new Adaptor(validatorMetrou);
        valideazaBilet(adaptor);

    }
}
