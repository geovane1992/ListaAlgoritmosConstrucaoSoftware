package br.ufg.algoritmo17;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialSomaTest {
    
   
    @Test
    public void testFatorialSoma() {
        System.out.println("fatorialSoma");
        int n = 1;
        double expResult = 1;
        double result = FatorialSoma.fatorialSoma(n);
        assertEquals(expResult, result, 1);
       
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        FatorialSoma.fatorialSoma(0);
    }
    
}
