package Teste.Teste;

import Teste.Dubluri.PachetDummy;
import Teste.Dubluri.PachetFake;
import clase.AgentieTurism;
import clase.iPachetTuristic;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgentieTurismTest {
    @Test
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism = new AgentieTurism();
        iPachetTuristic paachet0 = new PachetDummy();

        agentieTurism.adaugaPachet(paachet0);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());

    }

    @Test
    public void calculareSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetF1 = new PachetFake();
        PachetFake pachetF2 = new PachetFake();

        pachetF1.setPret(1000);
        pachetF2.setPret(500);

        agentieTurism.adaugaPachet(pachetF1);
        agentieTurism.adaugaPachet(pachetF2);
        assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
}