package br.ufg.algoritmo20;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RazaoAureaTest {
    
   
    @Test
    public void testRazaoAurea() {
        System.out.println("razaoAurea");
        double termo1 = 1;
        double termo2 = 1;
        double fator = 1;
        double expResult = 1;
        double result = RazaoAurea.razaoAurea(termo1, termo2, fator);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        RazaoAurea.razaoAurea(0,0,0);
    }
    
}
