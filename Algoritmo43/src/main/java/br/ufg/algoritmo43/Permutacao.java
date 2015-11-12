package br.ufg.algoritmo43;

import java.util.List;


public class Permutacao {
    public static List<String> permutacao(String prefixo, String conjunto, List<String> resultadoParcial){
        
        if (conjunto.length() == 1){
            resultadoParcial.add(prefixo + conjunto);
            return resultadoParcial;
        }
        
        for(int i = 0; i < conjunto.length(); i ++){
            StringBuilder sLinha = new StringBuilder(conjunto);
            char cI = conjunto.charAt(i);
            sLinha.deleteCharAt(i);
            
            String pLinha = prefixo + cI;
            
            permutacao(pLinha, sLinha.toString(), resultadoParcial);
        }
        
        return resultadoParcial;

    }
    
}
