package br.ufg.algoritmo39;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropriedadeTest {
    
 
    @Test
    public void testPropriedade() {
        System.out.println("propriedade");
        double expResult = 2;
        double result = Propriedade.propriedade();
        assertEquals(expResult, result, 2);
        
    }
    
}
