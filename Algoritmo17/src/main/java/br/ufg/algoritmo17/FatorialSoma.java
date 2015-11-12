package br.ufg.algoritmo17;

/**
 * Método criado para calcular fatorial.
 */

public class FatorialSoma {
    
     /**
     * @param n váriável que define o valor de entrada passado por parametro. 
     *
     * @return O fatorial do valor de entrada
     * 
     * @throws IllegalArgumentException Caso a variável n receba um valor menor que 1 entrará no Exception .
     */
    
    public static double fatorialSoma(int n){
        if (n < 1) {
                throw new IllegalArgumentException("Informe uma valor >= 1 para n!");
            }
        int contador = 2;
        int fatorial = 1;
        
        while(contador <= n) {
            fatorial = br.ufg.algoritmo4.Produto.produto(fatorial,contador);
            contador = contador + 1;
        }
        
     return fatorial;
    }
    
}
