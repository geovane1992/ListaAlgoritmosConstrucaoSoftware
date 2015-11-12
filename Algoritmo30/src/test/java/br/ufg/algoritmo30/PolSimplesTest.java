package br.ufg.algoritmo30;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolSimplesTest {
    
  
    @Test
    public void testPolSimples() {
        System.out.println("polSimples");
        int x = 1;
        int g = 1;
        int[] a = new int[]{1,0,1,1};
        double expResult = 1;
        double result = PolSimples.polSimples(x, g, a);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        PolSimples.polSimples(3,0,new int[]{0,0,0,0});
    }
    
}
