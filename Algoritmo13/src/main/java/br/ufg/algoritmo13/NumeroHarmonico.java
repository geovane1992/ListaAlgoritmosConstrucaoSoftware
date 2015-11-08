package br.ufg.algoritmo13;

/**
 * Método criado para calcular numeros harmônicos.
 */

public class NumeroHarmonico {
    
    /**
     * @param parametroEntrada váriável que recebe o valor de entrada para o calculo.  
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável parametroEntrada seja menor que 1 retornará uma exceção.
     */
    
    public static double numeroHarmonico(double parametroEntrada){
        if (parametroEntrada < 1) {
                   throw new IllegalArgumentException("Informe uma valor > que 1 para 'n'!");
           }
     
        double contador = 2;
        double valorEsperado = 1;
        
        while(contador <= parametroEntrada){
            valorEsperado = valorEsperado + (1/parametroEntrada);
            contador = contador + 1;
        }
        
        return valorEsperado;
    }
    

}
