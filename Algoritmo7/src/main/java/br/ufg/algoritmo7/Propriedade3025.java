package br.ufg.algoritmo7;

/**
 * Serviços oferecidos verificar o resultado da propriedade3025
 */

public class Propriedade3025 {
    
    /**
     * @param n Recebe o valor de start para o calculo.
     *
     * @return Verdadeiro se o resultado do calculo for igual ao parametro inicial e falso caso não seja.
     *
     * @throws IllegalArgumentException Caso o valor de n sejam invalidos
     * retorna uma exceção.
     */
    
    public static boolean propriedade3025(double n){
    
        if (n < 0 || n > 9999) {
                throw new IllegalArgumentException("Informe uma valor >= 0 e <= 9999 para n!");
        }
        
        double i = n / 100;
        double j = n % 100;
        
        if(((i + j) * (i + j)) == n ){
            
            return true;
        }
        else{
            return false;
        }
    }
}
