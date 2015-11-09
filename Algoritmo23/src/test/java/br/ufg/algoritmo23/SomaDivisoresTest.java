package br.ufg.algoritmo23;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaDivisoresTest {
    
    
    @Test
    public void testSomaDivisores() {
        System.out.println("somaDivisores");
        double n = 1;
        double expResult = 1;
        double result = SomaDivisores.somaDivisores(n);
        assertEquals(expResult, result, 1);
        
    }
    
      @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        SomaDivisores.somaDivisores(0);
    }
    
}
