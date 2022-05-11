package main;

import cts.command.Autobuz;
import cts.command.Comanda;
import cts.command.ComandaPlecareTraseu;
import cts.command.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("b11aaa");
        Autobuz a2 = new Autobuz("b22bbb");
        Autobuz a3 = new Autobuz("b33ccc");
        Operator operator = new Operator();

        operator.addComanda(new ComandaPlecareTraseu(1, a1));
        operator.addComanda(new ComandaPlecareTraseu(2, a2));
        operator.addComanda(new ComandaPlecareTraseu(3, a3));
        operator.addComanda(new ComandaPlecareTraseu(1, a3));
        operator.addComanda(new ComandaPlecareTraseu(4, a1));
        operator.addComanda(new ComandaPlecareTraseu(2, a1));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
