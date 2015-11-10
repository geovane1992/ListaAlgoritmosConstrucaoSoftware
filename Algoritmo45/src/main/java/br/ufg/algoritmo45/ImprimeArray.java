package br.ufg.algoritmo45;

/**
 * Serviço oferecidos para imprimir Array.
 */

public class ImprimeArray {
    
    /**
     * @param A Recebe os valores do array
     * @param n Recebe o valor para comparar com o contador
     *
     * @throws IllegalArgumentException Caso o valor passado para n seja menor que 0 retorna uma exceção.
     */
    
    public static void imprimeArray(int[] A, int n){
        if (n < 0) {
                throw new IllegalArgumentException("Informe uma valor maio ou igual a 0 para n!");
        }
        
        int contador = 1;
        
        while(contador <= n){
            System.out.println(A[contador]);
            contador = contador + 1;
        }
    }
    
}
