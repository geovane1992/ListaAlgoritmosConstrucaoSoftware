package br.ufg.algoritmo34;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CPF2Test {
    
    
    @Test
    public void testCpf2() {
        System.out.println("cpf2");
        long[] d = {0,0,3,9,2,6,9,2,5,1,3,2};
        boolean expResult = false;
        boolean result = CPF2.cpf2(d);
        assertEquals(expResult, result);
        
    }
    
}
