package br.ufg.algoritmo21;


/**
 * Serviço oferecidos para cacular se um numero 
 * é quadrado perfeito.
 */

public class QuadradoPerfeito {
    
    /**
     * Verifica se o numero passado como marâmetro é um quadrado perfeito.
     *
     * @param k Variável que recebe o numero passado como parâmetro.
     *
     * @return true para quadrado perfeito e false quando não é quadrado perfeito.
     *
     * @throws IllegalArgumentException Caso o valor informado seja menor que 1.
     */

    public static boolean quadradoPerfeito(int k){
        
        if (k < 1) {
            throw new IllegalArgumentException("Informe um valor maior ou igual a 1 para k!");
        }
        
        int i = 1;
        int q = 1;
        
        while(q < k){
            
            i = i + 2;
            q = q + i;
            
        }
        
        if(q == k){
            return true;
        }else{           
            return false;
        }
    }
}
