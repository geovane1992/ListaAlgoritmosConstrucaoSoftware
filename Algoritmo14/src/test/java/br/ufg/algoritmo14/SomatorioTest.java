package br.ufg.algoritmo14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomatorioTest {
 
    @Test
    public void testSomatorio() {
        System.out.println("somatorio");
        double parametroEntrada = 1;
        double expResult = 1;
        double result = Somatorio.somatorio(parametroEntrada);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Somatorio.somatorio(0);
    }
    
}
