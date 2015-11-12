package br.ufg.algoritmo31;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolHornerTest {
    
    
    @Test
    public void testPolHorner() {
        System.out.println("polHorner");
        int x = 0;
        int g = 1;
        int[] a = new int[]{1,1,1,1};
        double expResult = 1;
        double result = PolHorner.polHorner(x, g, a);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        PolHorner.polHorner(3,0,new int[]{0,0,0,0});
    }
    
}
