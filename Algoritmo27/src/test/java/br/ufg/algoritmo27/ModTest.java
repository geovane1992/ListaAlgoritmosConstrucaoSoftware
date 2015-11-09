package br.ufg.algoritmo27;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ModTest {
    
    
    @Test
    public void testMod() {
        System.out.println("mod");
        double x = 1;
        double y = 1;
        double expResult = 1;
        double result = Mod.mod(x, y);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Mod.mod(0, 0);
    }
    
}
