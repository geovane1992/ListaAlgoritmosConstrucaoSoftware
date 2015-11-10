package br.ufg.algoritmo46;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaArrayTest {
 
    @Test
    public void testSomaArray() {
        System.out.println("somaArray");
        int[] A = new int[]{0,1,2,3};
        int parametroEntrada = 3;
        double expResult = 6;
        double result = SomaArray.somaArray(A, parametroEntrada);
        assertEquals(expResult, result, 6);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        SomaArray.somaArray(new int[]{1,2,3}, -1);
    }
    
}
