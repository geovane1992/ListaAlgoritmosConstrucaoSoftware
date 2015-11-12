package br.ufg.algoritmo43;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PermutacaoTest {
    
    @Test
    public static void testCasoTrivial(){
      List<String> retorno = Permutacao.permutacao("", "a", new ArrayList<String>() );
        Assert.assertEquals(1, retorno.size());
        Assert.assertEquals("a", retorno.get(0));
    }
    
    @Test
    public static void testOutroCasoTrivial(){
      List<String> retorno = Permutacao.permutacao("", "ab", new ArrayList<String>() );
        Assert.assertEquals(2, retorno.size());
        Assert.assertTrue(retorno.contains("ab"));
        Assert.assertTrue(retorno.contains("ba"));
    }
    
    @Test
    public static void testCasoTrivial3(){
      List<String> retorno = Permutacao.permutacao("", "abcd", new ArrayList<String>() );
        Assert.assertEquals(24, retorno.size());
        Assert.assertTrue(retorno.contains("ab"));
        Assert.assertTrue(retorno.contains("ba"));
    }
    
}
