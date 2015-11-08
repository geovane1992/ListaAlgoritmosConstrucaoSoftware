package br.ufg.algoritmo11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MDCTest {
    
    
    @Test
    public void testMdc() {
        System.out.println("mdc");
        double a = 12;
        double b = 6;
        double expResult = 6;
        double result = MDC.mdc(a, b);
        assertEquals(expResult, result, 6);
        
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        MDC.mdc(6, 12);
    }
    
}
