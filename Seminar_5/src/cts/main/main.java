package cts.main;

import cts.validatoareSubterane.validatorMetrou;
import cts.validatoareSubterane.validatorSubteran;
import cts.validatoareTerestre.adaptor;
import cts.validatoareTerestre.validatorAutobuz;
import cts.validatoareTerestre.validatorTerestru;

public class main {

    public static void valideazaBilet(validatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilete();
    }

    public static void main(String[] args) {
        validatorSubteran validatorMetrou = new validatorMetrou();
        validatorTerestru validatorAutobuz = new validatorAutobuz();

        System.out.println("FARA ADAPTOR!!\n");

        valideazaBilet(validatorAutobuz);
        System.out.println();
        //valideazaBilet(validatorMetrou);

        System.out.println("CU ADAPTOR!!\n");

        adaptor adaptor = new adaptor(validatorMetrou);
        valideazaBilet(adaptor);

    }
}
