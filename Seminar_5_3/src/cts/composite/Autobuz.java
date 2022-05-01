package cts.composite;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements NodAbstract{
    private String producator;
    private String model;
    private int numarLocuri;

    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }



    @Override
    public void afiseazaDescriere() {

    }

    @Override
    public NodAbstract get(int poz) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);
    }
}
