package cts.validatorTerestru;

public class validatorAutobuz implements validatorTerestru{

    @Override
    public void valideazaBilete() {
        System.out.println("A fost validat biletul pentru autobuz!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul pentru autobuz!");
    }
}
