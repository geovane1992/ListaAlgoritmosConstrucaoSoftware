package br.ufg.algoritmo33;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CPFTest {
    
    
    @Test
    public void testCpf() {
        System.out.println("cpf");
        long[] d = {0,0,3,9,2,6,9,2,5,1,2,0};
        boolean expResult = false;
        boolean result = CPF.cpf(d);
        assertEquals(expResult, result);
        
    }
    
}
