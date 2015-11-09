package br.ufg.algoritmo25;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSubtracoesTest {
    
   
    @Test
    public void testDivideSubtracoes() {
        System.out.println("divideSubtracoes");
        double x = 1;
        double y = 1;
        double expResult = 1;
        double result = DivideSubtracoes.divideSubtracoes(x, y);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        DivideSubtracoes.divideSubtracoes(0, 0);
    }
    
}
