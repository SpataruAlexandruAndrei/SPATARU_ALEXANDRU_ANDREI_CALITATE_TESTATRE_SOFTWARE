package Teste.Teste;

import Teste.Dubluri.PersoanaFake;
import Teste.Dubluri.PersoanaStub;
import clase.IPersoana;
import clase.PachetTuristic;
import org.junit.Test;
import static org.junit.Assert.*;
public class PachetTuristicTest {

    @Test
    public void poateRezervaTest(){
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub,"Madrid", 2000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake =new PersoanaFake();
        persoanaFake.setVartsa(17);
        PachetTuristic pachetTuristic =new PachetTuristic(persoanaFake, "Madrid", 2000.0);

        assertFalse(pachetTuristic.poateRezerva());
    }
}
