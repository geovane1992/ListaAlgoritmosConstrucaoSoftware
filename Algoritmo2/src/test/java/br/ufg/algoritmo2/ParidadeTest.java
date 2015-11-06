
package br.ufg.algoritmo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ParidadeTest {
    
    @Test
    public void testParidade() {
        System.out.println("paridade");
        int n = 3;
        boolean expResult = false;
        boolean result = Paridade.paridade(n);
        assertEquals(expResult, result);

    }
    
}
