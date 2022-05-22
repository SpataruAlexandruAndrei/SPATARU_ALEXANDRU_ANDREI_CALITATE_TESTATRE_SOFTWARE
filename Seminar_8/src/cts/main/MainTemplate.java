package cts.main;

import cts.template.*;

public class MainTemplate {
    public static void main(String[] args) {
        TramvaiAbstract tramvai= new Tramvai();
        TramvaiAbstract tramvai2 = new TramvaiProbe();
        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseruInvers();
        tramvai2.parcurgereTraseu();
        tramvai2.parcurgereTraseruInvers();
    }
}
