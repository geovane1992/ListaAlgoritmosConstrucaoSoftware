package br.ufg.algoritmo41;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InverteCaracteresTest {
    
   
    @Test
    public void testInverteCaracteres() {
        System.out.println("inverteCaracteres");
        String string = "Geovane";
        String expResult = "enavoeG";
        String result = InverteCaracteres.inverteCaracteres(string);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        InverteCaracteres.inverteCaracteres("");
    }
    
}
