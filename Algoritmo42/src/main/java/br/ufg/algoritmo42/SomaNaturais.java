package br.ufg.algoritmo42;

/**
 * Serviço oferecidos para calcular somas naturais.
 */

public class SomaNaturais {
    
    /**
     * @param n Recebe o valor inicial a ser calculado
     *
     * @return A soma natural de n.
     *
     * @throws IllegalArgumentException Caso o valor passado seja menor que 1 retorna uma exceção.
     */
    
    public static double somaNaturais(double n){
        if (n < 1) {
                throw new IllegalArgumentException("Informe uma valor maio ou igual a 1 para n!");
        }
        
        if(n == 1){
            return 1;
        }
        else{
            return somaNaturais((n-1) + n);
        }
        
    }
    
}
