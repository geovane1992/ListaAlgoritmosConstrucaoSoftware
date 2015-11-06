package br.ufg.algoritmo4;

/**
 * Serviços oferecidos calcular o valor total de uma quantidade 
 * determinada de produtos.
 */


public class Produto {
    
    /*
     * @param a Valor do produto.
     * @param b Quantidade de produtos.
     *
     * @return Retorna a valor do calculo.
     *
     * @throws IllegalArgumentException Caso a ou b seja menor que 0
     * será retornado uma exceção 
     */
    
    public static int produto(int a, int b){
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Valor de a ou b não é válido!");
        }
        
        int contador = 1;
        int valorEsperado = 0;
        
        while(contador <= b){
            valorEsperado = valorEsperado + a;
            contador = contador + 1;
        }
        
        return valorEsperado;
    }
    
}
