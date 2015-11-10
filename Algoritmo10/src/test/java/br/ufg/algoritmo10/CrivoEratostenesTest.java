package br.ufg.algoritmo10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CrivoEratostenesTest {
    
  
    @Test
    public void testCrivoEratostenes() {
        System.out.println("crivoEratostenes");
        int[] a = new int[]{0,1,2,3};
        int n = 3;
        CrivoEratostenes.crivoEratostenes(a, n);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        CrivoEratostenes.crivoEratostenes(new int[]{0,1,2,3}, 0);
    }
    
}
