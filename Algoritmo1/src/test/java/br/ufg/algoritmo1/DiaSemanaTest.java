package br.ufg.algoritmo1;


import org.junit.Test;
import static org.junit.Assert.*;


public class DiaSemanaTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDiaInvalido() {
        DiaSemana.diaDaSemana(-1, 8, 2015);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMesInvalido() {
        DiaSemana.diaDaSemana(1, 45, 2015);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testAnoInvalido() {
        DiaSemana.diaDaSemana(1, 5, 100);
    }

    @Test
    public void test27082015() throws Exception {

        int dds = DiaSemana.diaDaSemana(27, 8, 2015);
        assertEquals(3, dds);
    }

    @Test
    public void test29022016() throws Exception {

        int dds = DiaSemana.diaDaSemana(29, 2, 2016);
        assertEquals(0, dds);
    }

    @Test
    public void testUmJaneiro() throws Exception {

        int dds = DiaSemana.diaDaSemana(2, 1, 2015);
        assertEquals(4, dds);
    }

    @Test
    public void testOutraDataConhecida() throws Exception {

        int dds = DiaSemana.diaDaSemana(3, 1, 2015);
        assertEquals(5, dds);
    }
    
}
