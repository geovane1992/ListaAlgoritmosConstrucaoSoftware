package br.ufg.algoritmo45;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImprimeArrayTest {
    
   
    @Test
    public void testImprimeArray() {
        System.out.println("imprimeArray");
        int[] A = new int[]{1,2,3,5};
        int n = 3;
        ImprimeArray.imprimeArray(A, n);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        ImprimeArray.imprimeArray(new int[]{1,2,3}, -1);
    }
    
}
