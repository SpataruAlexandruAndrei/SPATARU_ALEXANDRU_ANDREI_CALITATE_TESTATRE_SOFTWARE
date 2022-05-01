package main;

import cts.Proxy.Autobuz;
import cts.Proxy.MijlocTransport;
import cts.decorator.Decorator;
import cts.decorator.DecoratorOcazional;
import cts.decorator.Printer;
import cts.decorator.PrinterBilet;

public class main {
    public static void main(String[] args) {
//        Decorator
        Printer printer = new PrinterBilet();
        Decorator decorator = new DecoratorOcazional(printer, "La multi ani!");
        printer.printeazaBilet();
        decorator.printeazaMesaj();
//      Proxy
        MijlocTransport autobuzNormal = new Autobuz(0, "nume1");
        autobuzNormal.opresteInStatie();
    }

}
