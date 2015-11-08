package br.ufg.algoritmo8;

  /**
 * Método criado para calcular propriedade153
 */

public class Propriedade153 {
    
     /**
     * @param n váriável que define o valor de entrada passado por parametro. 
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso a variável n receba um valor menor que 0 ou maior que 999 entrará no Exception .
     */

    public static boolean propriedade153(int n){
        
          if (n < 0 || n > 999) {
            throw new IllegalArgumentException("Informe um valor maior que 0 e menor que 1000 para n!");
        }
        
        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;
        
        return ((i * i * i) + (j * j * j) + (k * k * k) == n);

    }
    
}
