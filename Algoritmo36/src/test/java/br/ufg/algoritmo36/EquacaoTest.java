package br.ufg.algoritmo36;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquacaoTest {
    
   
    @Test
    public void testEquacao() {
        System.out.println("equacao");
        double expResult = 0.0;
        double result = Equacao.equacao();
        assertEquals(expResult, result, 0.0);
        
    }

}
