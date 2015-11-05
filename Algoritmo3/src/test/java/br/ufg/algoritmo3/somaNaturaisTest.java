/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.somanaturais;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunoinf
 */
public class somaNaturaisTest {
    
    @org.junit.Test
    public void testSomaNaturais() {
        System.out.println("somaNaturais");
        int n = 2;
        int expResult = 1;
        int result = somaNaturais.somaNaturais(n);
        assertEquals(expResult, result);

    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        somaNaturais.somaNaturais(0);
    }
    
}
