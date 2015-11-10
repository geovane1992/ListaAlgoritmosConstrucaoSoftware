package br.ufg.algoritmo10;

/**
 * Método criado para calcular o crivo de eratostenes.
 */

public class CrivoEratostenes {
    
      /**
     * @param n váriável que define o valor de entrada passado por parametro. 
     * @param a Recebe o array de inteiros como parâmetro. 
     *
     * @throws IllegalArgumentException Caso a variável n receba um valor menor ou igual a 1 entrará no Exception .
     */
    
    public static void crivoEratostenes(int[] a, int n){
        if (n <= 1) {
                throw new IllegalArgumentException("Informe uma valor > 1 para n!");
            }
        
        int contador = 2;
        
        while(contador <= (n/2)){
            
            if(contador >= 2 && n >= contador){
                a[contador] = 0;
            }
            
            if(a[contador] == 0){
                int c = contador + contador;
                while(c <= n){
                    a[c] = 1;
                    c = c + contador;
                }
            }
            contador = contador + 1;            
        }
    }
}
