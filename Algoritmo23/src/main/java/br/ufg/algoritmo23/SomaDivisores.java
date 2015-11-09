package br.ufg.algoritmo23;

/**
 * Serviço oferecidos para cacular soma de divisores
 */

public class SomaDivisores {
    
    /**
     * @param parametroEntrada Recebe o valor de start para o calculo
     *
     * @return O resultado do calculo, ou seja, a soma dos divisores..
     *
     * @throws IllegalArgumentException Caso o valor dos parâmetros sejam 
     * menores ou igual a 0.
     */
    
     public static double somaDivisores(double parametroEntrada){
        
        if (parametroEntrada <= 0) {
            throw new IllegalArgumentException("Informe um valor válido para parametroEntrada!");
        }
        
       double contador = 2;
       double valorEsperado = 1;
       
       while(contador <= (parametroEntrada/2)){
           if((parametroEntrada%contador) == 0){
               valorEsperado = valorEsperado + contador;
           }
           contador = contador + 1;
       }
       return valorEsperado;
    }
    
}
