package test;

import cts.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {
//    @Test
//    public void test(){
//        fail("Not yet implemented");
//    }
//
    private Matematica mate;

    @Before
    public void setup(){
        mate = new Matematica();
    }

    @Test
    public void testSumaCorecta(){
        int rezultat = mate.suma(5, 9);
        assertEquals(14, rezultat);
    }

    @Test
    public void testRaportCorect(){
        double rezultat = mate.raport(27,6);
        assertEquals(4.5, rezultat, 0.001);
    }

    @Test
    public void testRaportException(){
        try{
            mate.raport(27,0);
            fail("Nu trebuia sa ajunga aici!");
        }catch (IllegalArgumentException exception){

        }
    }

    @Test
    public void testEsteParCorect(){
        assertTrue(mate.estePar(6));
        assertFalse(mate.estePar(5));
    }

    @Test
    public  void testIsNotNull(){


        List<Integer> lista = mate.nNumerePare(3);
        assertNotNull(lista);
    }
}