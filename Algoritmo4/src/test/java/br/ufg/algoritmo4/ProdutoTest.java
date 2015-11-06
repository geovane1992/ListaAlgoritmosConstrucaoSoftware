
package br.ufg.algoritmo4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProdutoTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testException() {
        Produto.produto(-1, 0);
    }
    
    @Test
    public void testCalculoProduto() {
        System.out.println("produto");
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = Produto.produto(a, b);
        assertEquals(expResult, result);
        
    }
    
}
