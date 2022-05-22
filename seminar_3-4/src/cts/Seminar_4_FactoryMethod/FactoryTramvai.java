package cts.Seminar_4_FactoryMethod;

public class FactoryTramvai implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Tramvai(numarInmatriculare);
    }
}
