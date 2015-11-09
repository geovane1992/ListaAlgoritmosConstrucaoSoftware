package br.ufg.algoritmo21;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoPerfeitoTest {
    
    
    @org.junit.Test
    public void testQuadradoPerfeito() {
        System.out.println("quadradoPerfeito");
        int k = 1;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadradoPerfeito(k);
        assertEquals(expResult, result);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        QuadradoPerfeito.quadradoPerfeito(0);
    }
    
}
