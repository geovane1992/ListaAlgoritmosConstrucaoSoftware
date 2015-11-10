package br.ufg.algoritmo28;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideTest {
    
    
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 1;
        int b = 1;
        int k = 1;
        Divide.divide(a, b, k);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Divide.divide(0,0,0);
    }
    
}
