package br.ufg.algoritmo19;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LognTest {
    
    
    @Test
    public void testLogn() {
        System.out.println("logn");
        double n = 1;
        double k = 2;
        double expResult = 2.5;
        double result = Logn.logn(n, k);
        assertEquals(expResult, result, 2.5);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Logn.logn(0, 0);
    }
    
}
