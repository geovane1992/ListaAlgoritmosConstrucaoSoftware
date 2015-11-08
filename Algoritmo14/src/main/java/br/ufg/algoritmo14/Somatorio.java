package br.ufg.algoritmo14;

/**
 * Método criado para calcular soatorio.
 */

public class Somatorio {
    
    /**
     * @param parametroEntrada váriável que recebe o valor de entrada para o calculo.  
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável parametroEntrada seja menor que 1 retornará uma exceção.
     */
    
     public static double somatorio(double parametroEntrada){
        if (parametroEntrada < 1) {
                   throw new IllegalArgumentException("Informe uma valor > que 1 para 'parametroEntrada'!");
           }
     
        double contador = 1;
        double valorEsperado = 0;
        
        while(contador <= parametroEntrada){
            
            double d = 1 + (contador * contador);
            valorEsperado = valorEsperado + (1/d);
            contador = contador + 1;
            
        }
     return valorEsperado;
        
     }
         
}
