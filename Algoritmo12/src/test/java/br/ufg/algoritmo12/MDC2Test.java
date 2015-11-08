package br.ufg.algoritmo12;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MDC2Test {
    
    
    @Test
    public void testMdc2() {
        System.out.println("mdc2");
        double a = 12;
        double b = 6;
        double expResult = 6;
        double result = MDC2.mdc2(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        MDC2.mdc2(6, 12);
    }
    
}
