package br.ufg.algoritmo40;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtendeSomaFatDigitosTest {
    
   
    @Test
    public void testAtendeSomaFatDigitos() {
        System.out.println("atendeSomaFatDigitos");
        double n = 2005;
        boolean expResult = false;
        boolean result = AtendeSomaFatDigitos.atendeSomaFatDigitos(n);
        assertEquals(expResult, result);
        
    }
    
}
