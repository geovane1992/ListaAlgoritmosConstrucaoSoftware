
package br.ufg.algoritmo3;

import br.ufg.algoritmo3.SomaNaturais;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SomaNaturaisTest {
    
    @org.junit.Test
    public void testSomaNaturais() {
        System.out.println("somaNaturais");
        int n = 1;
        int expResult = 1;
        int result = SomaNaturais.somaNaturais(n);
        assertEquals(expResult, result);

    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        SomaNaturais.somaNaturais(0);
    }
    
}
