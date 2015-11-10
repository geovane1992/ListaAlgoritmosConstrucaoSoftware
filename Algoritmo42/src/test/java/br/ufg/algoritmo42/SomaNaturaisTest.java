package br.ufg.algoritmo42;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaNaturaisTest {
    
   
    @Test
    public void testSomaNaturais() {
        System.out.println("somaNaturais");
        double n = 1;
        double expResult = 1;
        double result = SomaNaturais.somaNaturais(n);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        SomaNaturais.somaNaturais(0);
    }
    
}
