package br.ufg.algoritmo12;

/**
 * Método criado para calcular o máximo divisor comum.
 */

public class MDC2 {
    
    /**
     * @param a váriável que recebe o 1º numero natural para ser calculado. 
     * @param b váriável que recebe o 2º numero natural para ser calculado. 
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável a ou b receba um valor inválido entrará no Exception .
     */
    
    public static double mdc2(double a, double b){
        
        if (a < b || b <= 0) {
                throw new IllegalArgumentException("Informe uma valor válido para 'a' e para 'b'!");
        }
        
        while(a != b){
            
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        
        return a;
    }
}
