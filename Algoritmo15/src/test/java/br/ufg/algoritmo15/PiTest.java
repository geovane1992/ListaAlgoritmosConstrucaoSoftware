package br.ufg.algoritmo15;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PiTest {
    
    
    @Test
    public void testPi() {
        System.out.println("pi");
        double parametroEntrada = 1;
        double expResult = 4;
        double result = Pi.pi(parametroEntrada);
        assertEquals(expResult, result, 4);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Pi.pi(0);
    }
    
}
