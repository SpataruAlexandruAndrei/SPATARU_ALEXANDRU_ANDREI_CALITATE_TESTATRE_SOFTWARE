package cts.composite;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class composite implements NodAbstract{
    List<NodAbstract> lista;
    private String denumire;

    public composite(String denumire) {
        super();
        lista = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumirea grupului este:" + this.denumire);
        for(NodAbstract i: lista){
            i.afiseazaDescriere();
        }
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionControl.NotImplementedException {
        return lista.get(poz);
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        lista.add(nodAbstract);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        lista.remove(nodAbstract);
    }
}
