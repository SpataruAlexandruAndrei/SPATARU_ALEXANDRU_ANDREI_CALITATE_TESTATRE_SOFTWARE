package cts.main;

import cts.composite.NodAbstract;
import cts.composite.Autobuz;
import cts.composite.composite;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        NodAbstract a1 = new Autobuz("Dacia", "aaa", 7);
        NodAbstract a2 = new Autobuz("Dacia", "aaa", 12);
        NodAbstract a3 = new Autobuz("Dacia", "aaa",45);
        NodAbstract grupMici = new composite("autobuze Mici");
        NodAbstract grupMari = new composite("autobuze Mari");
        NodAbstract flota = new composite("Flota");

        {
            try {
                grupMici.add(a1);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                grupMici.add(a2);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                grupMari.add(a3);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                flota.add(grupMici);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                flota.add(grupMari);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            flota.afiseazaDescriere();
            grupMici.afiseazaDescriere();

        }
    }
}
