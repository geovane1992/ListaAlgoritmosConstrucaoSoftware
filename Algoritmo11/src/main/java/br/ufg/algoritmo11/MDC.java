package br.ufg.algoritmo11;

/**
 * Método criado para calcular o máximo divisor comum.
 */

public class MDC {
    
    /**
     * @param a váriável que recebe o 1º numero natural para ser calculado. 
     * @param b váriável que recebe o 2º numero natural para ser calculado. 
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável a ou b receba um valor inválido entrará no Exception .
     */
    
    public static double mdc(double a, double b){
        
         if (a < b || b <= 0) {
            throw new IllegalArgumentException("Informe um valor valido para 'a' e para 'b'!");
        }
         
         while(b != 0){
             
             double m = a%b;
                    a = b;
                    b = m;
         }
         
         return a;
    }
   
    
}
