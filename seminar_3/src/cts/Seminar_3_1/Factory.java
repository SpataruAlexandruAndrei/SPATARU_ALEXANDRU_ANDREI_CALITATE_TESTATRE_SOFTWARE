package cts.Seminar_3_1;

public class Factory {
    public static MijlocTrasnportComun creareMijlocTransport(TipMijlocTransport tip, String numarInmatriculare){
        switch (tip){
            case Autobuz:
                return new Autobuz(numarInmatriculare);
            case Tramvai:
                return new Tramvai(numarInmatriculare);
            case Troilebuz:
                return new Trolebuz(numarInmatriculare);
            default:
                return null;
        }
    }
}
