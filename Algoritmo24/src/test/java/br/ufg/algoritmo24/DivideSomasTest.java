package br.ufg.algoritmo24;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DivideSomasTest {
    
    
    @Test
    public void testDivideSomas() {
        System.out.println("divideSomas");
        double x = 1;
        double y = 1;
        double expResult = 1;
        double result = DivideSomas.divideSomas(x, y);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        DivideSomas.divideSomas(0, 0);
    }
    
}
