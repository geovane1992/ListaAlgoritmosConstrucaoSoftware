package br.ufg.algoritmo32;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    
    
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        double n = 5;
        double expResult = 5;
        double result = Fibonacci.fibonacci(n);
        assertEquals(expResult, result, 5);
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        Fibonacci.fibonacci(0);
    }
    
}
