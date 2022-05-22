package cts.Seminar_4_FactoryMethod;

public class FactoryTroleibuz  implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Troleibuz(numarInmatriculare);
    }
}
