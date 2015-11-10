package br.ufg.algoritmo18;

/**
 * Método criado para calcular Log natural.
 */

public class LogNaturalSimples {
    
    /**
     * @param n váriável1 que define o valor de entrada passado por parametro. 
     * @param k váriável2 que define o valor de entrada passado por parametro. 
     *
     * @return O log dos valores de entrada
     * 
     * @throws IllegalArgumentException Caso a variável n receba um valor menor que 1 ou k menor que 2 entrará no Exception .
     */
    
    public static double logNaturalSimples(int n, int k){
        if (n < 1 || k < 2) {
                throw new IllegalArgumentException("Informe uma valor >= 1 para n e >= 2 para k!");
         }
        
        int contador = 2;
        double valorEsperado = n + 1;
        
        while(contador <= k){
            double potencia = br.ufg.algoritmo5.Potencia.potencia(n, contador);
            double fatorial = br.ufg.algoritmo16.Fatorial.fatorial(contador);
             valorEsperado = valorEsperado + (potencia/fatorial);
            contador = contador + 1;
        }
        
    return valorEsperado;
    }
    
}
