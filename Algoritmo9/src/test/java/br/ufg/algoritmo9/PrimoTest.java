package br.ufg.algoritmo9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoTest {
    
   
    @Test
    public void testPrimo() {
        System.out.println("primo");
        int n = 2;
        boolean expResult = true;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Primo.primo(0);
    }

    
}
