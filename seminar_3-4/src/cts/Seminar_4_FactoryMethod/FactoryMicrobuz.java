package cts.Seminar_4_FactoryMethod;

public class FactoryMicrobuz implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Microbuz(numarInmatriculare);
    }
}
