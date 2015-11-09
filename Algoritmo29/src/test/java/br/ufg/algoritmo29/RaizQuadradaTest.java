package br.ufg.algoritmo29;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RaizQuadradaTest {
    
   
    @Test
    public void testRaiz() {
        System.out.println("raiz");
        double n = 1;
        double i = 1;
        double expResult = 1;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        RaizQuadrada.raizQuadrada(0, 0);
    }
    
}
