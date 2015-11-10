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
        int n = 1;
        int m = 1;
        boolean expResult = true;
        boolean result = Amigos.amigos(n, m);
        assertEquals(expResult, result);
       
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Amigos.amigos(0,0);
    }
    
}
