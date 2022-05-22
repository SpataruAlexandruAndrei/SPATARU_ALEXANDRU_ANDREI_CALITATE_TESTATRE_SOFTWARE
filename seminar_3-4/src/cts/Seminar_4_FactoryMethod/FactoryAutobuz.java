package cts.Seminar_4_FactoryMethod;

public class FactoryAutobuz implements  Factory{

    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Autobuz(numarInmatriculare);
    }
}
