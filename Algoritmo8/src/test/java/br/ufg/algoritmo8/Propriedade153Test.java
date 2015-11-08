package br.ufg.algoritmo8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Propriedade153Test {
    
    @Test
    public void testPropriedade123() {
        System.out.println("propriedade153");
        int n = 1;
        boolean expResult = true;
        boolean result = Propriedade153.propriedade153(n);
        assertEquals(expResult, result);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Propriedade153.propriedade153(1000);
    }
}
