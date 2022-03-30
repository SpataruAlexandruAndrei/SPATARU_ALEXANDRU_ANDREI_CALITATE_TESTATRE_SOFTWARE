package cts.Seminar_3_1;

public class Main {
    public static void main(String[] args) {
       MijlocTrasnportComun mijloc1 =  Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "merge1");
       MijlocTrasnportComun mijloc2 =  Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "merge2");
       MijlocTrasnportComun mijloc3 =  Factory.creareMijlocTransport(TipMijlocTransport.Troilebuz, "merge13");

        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);
    }
}
