package br.ufg.algoritmo38;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HipotenusaTest {
    
 
    @Test
    public void testHipotenusa() {
        System.out.println("hipotenusa");
        int A = 1;
        int B = 1;
        double expResult = 1;
        double result = Hipotenusa.hipotenusa(A, B);
        assertEquals(expResult, result, 1);
        
    }
    
}
