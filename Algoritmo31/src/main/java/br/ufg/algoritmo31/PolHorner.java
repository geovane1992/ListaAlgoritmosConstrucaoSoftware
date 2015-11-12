package br.ufg.algoritmo31;

/**
 * Método para calcular pol-horner.
 */


public class PolHorner {
    
     /**
     * @param x váriável1 que define a primeira entrada. 
     * @param g váriável2 que define a segunda entrada. 
     * @param a array de inteiros. 
     *
     * @return O valor do po-simples.
     * 
     * @throws IllegalArgumentException Caso a variável g for menor que 1 ou de a na posição 0 for igual a 0 entrará no Exception .
     */
    
    public static double polHorner(int x, int g, int[] a){
        
        if (g < 1) {
                throw new IllegalArgumentException("Informe um valor maior ou igual a 1 para g!");
        }
        
        int valorEsperado = a[1];
        int contador = g - 1;
        
        while(contador >= 0){
            valorEsperado = (valorEsperado * x) + a[contador];
            contador = contador - 1;
        }
    return valorEsperado;
    }
    
}
