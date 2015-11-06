package br.ufg.algoritmo5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PotenciaTest {
    
   @Test(expected=IllegalArgumentException.class)
    public void testBaseInvalida() {
        Potencia.potencia(0, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testPotenciaInvalida() {
        Potencia.potencia(3, -1);
    }
 
    @Test
    public void testCalculo() {
        System.out.println("potencia");
        int base = 3;
        int potencia = 6;
        int expResult = 729;
        int result = Potencia.potencia(base, potencia);
        assertEquals(expResult, result);
        
    }
    
}
