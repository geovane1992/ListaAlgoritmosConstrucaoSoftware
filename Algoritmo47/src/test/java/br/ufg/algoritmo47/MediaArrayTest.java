package br.ufg.algoritmo47;

import br.ufg.algoritmo46.SomaArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MediaArrayTest {
    
    
    @Test
    public void testMediaArray() {
        System.out.println("mediaArray");
        int[] A = new int[]{0,1,2,3};
        int n = 3;
        double expResult = 2;
        double result = MediaArray.mediaArray(A, n);
        assertEquals(expResult, result, 2);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        MediaArray.mediaArray(new int[]{0,1,2,3}, -1);
    }
    
}
