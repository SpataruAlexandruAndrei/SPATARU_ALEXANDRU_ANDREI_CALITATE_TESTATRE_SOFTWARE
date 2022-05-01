package cts.facade;

import cts.autobuz.Autobuz;

public class facade {
    private Autobuz autobuz;

    public facade(){
        autobuz = new Autobuz();
    }

    public void deschideUsi(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void liberUsi(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }
}
