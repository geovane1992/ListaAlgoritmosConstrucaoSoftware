package br.ufg.algoritmo37;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AckermanTest {
    
    
    @Test
    public void testAckerman() {
        System.out.println("ackerman");
        double x = 0.0;
        double y = 0.0;
        double expResult = 1;
        double result = Ackerman.ackerman(x, y);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Ackerman.ackerman(-1, -1);
    }
    
}
