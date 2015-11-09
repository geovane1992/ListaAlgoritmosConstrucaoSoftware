package br.ufg.algoritmo6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PotenciaSomaTest {
    
    @Test
    public void testPotenciaSoma() {
        System.out.println("potenciaSoma");
        double base = 0.0;
        double potencia = 0.0;
        double expResult = 0.0;
        double result = PotenciaSoma.potenciaSoma(base, potencia);
        assertEquals(expResult, result, 0.0);

    }
    
}
