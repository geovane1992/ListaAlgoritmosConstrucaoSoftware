package br.ufg.algoritmo22;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AmigosTest {
   
    @Test
    public void testAmigos() {
        System.out.println("amigos");
        double n = 0.0;
        double m = 0.0;
        boolean expResult = false;
        boolean result = Amigos.amigos(n, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Amigos.amigos(2,3);
    }
    
}
