package br.ufg.algoritmo19;

/**
 * Método criado para calcular logn.
 */

public class Logn {
    
    /**
     * @param n váriável1 que recebe o valor de entrada para o calculo.  
     * @param K váriável2 que recebe o valor de entrada para o calculo.  
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável n seja menor que 1 ou k seja menor que 2 retornará uma exceção.
     */
    
    public static double logn(double n, double k){
        if (n < 1 || k < 2) {
                   throw new IllegalArgumentException("Informe uma valor valido >= a 1 para n e >= 2 para k!");
        }
        
        double contador = 2;
        double e = n + 1;
        double t = n;
        
        while (contador <= k){
            
            t = t * (n/contador);
            e = e + t;
            contador = contador + 1;
        }
        
        return e;
    }
    
}
