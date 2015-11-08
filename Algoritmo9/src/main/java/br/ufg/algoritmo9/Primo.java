package br.ufg.algoritmo9;

/**
 * Método criado para calcular se um numero é primo ou nao.
 */

public class Primo {
    
    /**
     * @param n váriável que define o valor de entrada passado por parametro. 
     * 
     * @return O valor resultante do calculo será retornado a função, ou seja, se é ou nao primo.
     *
     * @throws IllegalArgumentException Caso a variável n receba um valor menor ou igual a 1 entrará no Exception .
     */
    
    public static boolean primo(int n){
    
        if (n <= 1) {
                throw new IllegalArgumentException("Informe uma valor > 1 para n!");
            }
        
        int contador = 2;
        
        while(contador <= (n - 1)){
            if(n%contador == 0){
                return false;
            }
            contador = contador + 1;
        }
        
        return true;
    }
    
}
