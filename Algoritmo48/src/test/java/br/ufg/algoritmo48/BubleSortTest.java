package br.ufg.algoritmo48;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubleSortTest {
   
    @Test
    public void testBubleSort() {
        System.out.println("bubleSort");
        int[] A = new int[]{3,1,2,0};
        int n = 3;
        int[] expResult = {3,2,1,0};
        int[] result = BubleSort.bubleSort(A, n);
        assertArrayEquals(expResult, result);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        BubleSort.bubleSort(new int[]{3,1,2,0}, -1);
    }
    
}
