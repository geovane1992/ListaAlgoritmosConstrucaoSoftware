package br.ufg.algoritmo15;

/**
 * Método criado para calcular PI.
 */

public class Pi {
    
    /**
     * @param parametroEntrada váriável que recebe o valor de entrada para o calculo.  
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável parametroEntrada seja menor que 1 retornará uma exceção.
     */
    
    public static double pi(double parametroEntrada){
        
        if (parametroEntrada < 1) {
                   throw new IllegalArgumentException("Informe uma valor > que 1 para 'parametroEntrada'!");
        }
        
        double contador = 1;
        double s = -1;
        double d = -1;
        double valorEsperado = 0;
        
        while(contador <= parametroEntrada){
            d = d + 2;
            s = -1 * s;
            valorEsperado = valorEsperado + (4 * (s/d));
            contador = contador + 1;
            
        }
        
        return valorEsperado;
    }
    
}
