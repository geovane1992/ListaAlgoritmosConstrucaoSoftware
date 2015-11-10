package br.ufg.algoritmo6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaSomaTest {

    
    @Test
    public void testPotenciaSoma() {
        System.out.println("potenciaSoma");
        int base = 10;
        int potencia = 2;
        double expResult = 100;
        double result = PotenciaSoma.potenciaSoma(base, potencia);
        assertEquals(expResult, result, 100);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        PotenciaSoma.potenciaSoma(-1, 0);
    }
    
}
