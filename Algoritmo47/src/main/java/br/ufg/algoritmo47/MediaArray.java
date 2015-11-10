package br.ufg.algoritmo47;

/**
 * Serviço oferecidos para calcular a média dos valores do array.
 */

public class MediaArray {
    
     /**
     * @param A Recebe o array de inteiros 
     *
     * @return A media do array
     * 
     * @throws IllegalArgumentException Caso o valor passado para para,n seja menor que 0 retorna uma exceção.
     */
    
    public static double mediaArray(int[] A, int n){
        if (n < 0) {
            throw new IllegalArgumentException("Informe uma valor > 0 para n!");
        }
        
        double valorEsperado = br.ufg.algoritmo46.SomaArray.somaArray(A, n);

     return valorEsperado / n;
    }
    
}
