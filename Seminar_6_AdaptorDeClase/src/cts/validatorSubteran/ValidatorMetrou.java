package cts.validatorSubteran;

public class ValidatorMetrou implements ValidatorSubteran {


    @Override
    public void valideazaCalatorii() {
        System.out.println("A fost validata calatoria pentru metrou!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul pentru metrou!");
    }
}
