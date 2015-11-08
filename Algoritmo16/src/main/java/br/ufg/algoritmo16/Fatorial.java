package br.ufg.algoritmo16;

/**
 * Método criado para calcular fatorial.
 */

public class Fatorial {
    
    /**
     * @param parametroEntrada váriável que recebe o valor de entrada para o calculo.  
     * 
     * @return O valor resultante do calculo será retornado a função, ou seja, o fatorial.
     *
     * @throws IllegalArgumentException Caso a variável parametroEntrada seja menor que 1 retornará uma exceção.
     */
    
    public static double fatorial(double parametroEntrada){
         if (parametroEntrada < 1) {
                   throw new IllegalArgumentException("Informe uma valor > que 1 para 'parametroEntrada'!");
        }
         
         double contador = 2;
         double fatorial = 1;
         
         while(contador <= parametroEntrada){
             fatorial = fatorial * 1;
             contador = contador + 1;
         }
    return fatorial;
    }
    
}
