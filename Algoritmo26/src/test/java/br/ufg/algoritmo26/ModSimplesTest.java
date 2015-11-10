package br.ufg.algoritmo26;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModSimplesTest {
    
    
    @Test
    public void testModSimples() {
        System.out.println("modSimples");
        int x = 1;
        int y = 1;
        double expResult = 1;
        double result = ModSimples.modSimples(x, y);
        assertEquals(expResult, result, 1);
        
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        ModSimples.modSimples(0,0);
    }
    
}
