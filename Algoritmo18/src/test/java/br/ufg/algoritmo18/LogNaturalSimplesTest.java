package br.ufg.algoritmo18;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogNaturalSimplesTest {
    
  
    @Test
    public void testLogNaturalSimples() {
        System.out.println("logNaturalSimples");
        int n = 3;
        int k = 2;
        double expResult = 13;
        double result = LogNaturalSimples.logNaturalSimples(n, k);
        assertEquals(expResult, result, 13);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        LogNaturalSimples.logNaturalSimples(0, 1);
    }
    
}
