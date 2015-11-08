package br.ufg.algoritmo7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Propriedade3025Test {
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Propriedade3025.propriedade3025(-1);
    }
    
    @Test
    public void testPropriedade3025() {
        System.out.println("propriedade3025");
        double n = 0.0;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade3025(n);
        assertEquals(expResult, result);

    }
    
}
