package br.ufg.algoritmo48;

/**
 * Serviço oferecidos para ordenar array.
 */


public class BubleSort {
    
     /**
     * @param A Recebe o array de inteiros 
     *
     * @return O array ordenado
     * 
     * @throws IllegalArgumentException Caso o valor passado para n seja menor que 0 retorna uma exceção.
     */
    
    public static int[] bubleSort(int[] A, int n){
        if (n < 0) {
            throw new IllegalArgumentException("Informe uma valor > ou igual a 0 para n!");
        }
        
        int p = n;
        
        while(p >= 1){
           int contador = 1;
           while(contador < p){
               if(A[contador] < A[contador + 1]){
                   int t = A[contador];
                   A[contador] = A[contador + 1];
                   A[contador + 1] = t;
               }
               contador = contador + 1;
           }
           p = p - 1;
        }
    return A;    
    }
    
    
}
