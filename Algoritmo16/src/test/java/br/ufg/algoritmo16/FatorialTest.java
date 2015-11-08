package br.ufg.algoritmo16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {
    
   
    @Test
    public void testFatorial() {
        System.out.println("fatorial");
        double parametroEntrada = 1;
        double expResult = 1;
        double result = Fatorial.fatorial(parametroEntrada);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Fatorial.fatorial(0);
    }
    
}
