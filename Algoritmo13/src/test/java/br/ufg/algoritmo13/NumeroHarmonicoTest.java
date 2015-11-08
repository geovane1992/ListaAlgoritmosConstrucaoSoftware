package br.ufg.algoritmo13;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroHarmonicoTest {
    
    
    @Test
    public void testNumeroHarmonico() {
        System.out.println("numeroHarmonico");
        double parametroEntrada = 1;
        double expResult = 1;
        double result = NumeroHarmonico.numeroHarmonico(parametroEntrada);
        assertEquals(expResult, result, 1);
        
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        NumeroHarmonico.numeroHarmonico(0);
    }
    
}
