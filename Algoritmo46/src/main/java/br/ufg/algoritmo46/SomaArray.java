package br.ufg.algoritmo46;

/**
 * Serviço oferecidos para somar array.
 */

public class SomaArray {
    
       /**
     * @param A Recebe o array de inteiros 
     *
     * @return A soma do array
     * 
     * @throws IllegalArgumentException Caso o valor passado para para,etroEntrada seja menor que 0 retorna uma exceção.
     */
    
    public static double somaArray(int[] A, int parametroEntrada){
        
        if (parametroEntrada < 0) {
            throw new IllegalArgumentException("Informe uma valor > 0 para n!");
        }
        int valorEsperado = 0;
        int contador = 1;
        
        while (contador <= parametroEntrada){
            valorEsperado = valorEsperado + A[contador];
            contador = contador + 1;
            
        }
    return valorEsperado;
    }
    
}
