package br.ufg.algoritmo6;

/**
 * Servi�o oferecidos para calcular potencia.
 */


public class PotenciaSoma {
    
    /**
     * @param base Recebe os valores da base 
     * @param potencia Recebe o valor da pot�ncia
     *
     * @return O valor do calculo da pot�ncia
     * 
     * @throws IllegalArgumentException Caso o valor passado para base seja menor ou igual a 0 ou o da pot�ncia for menor que 1 retorna uma exce��o.
     */
    
    public static double potenciaSoma(int base, int potencia){
        
         if (base <= 0 || potencia < 1) {
            throw new IllegalArgumentException("Informe uma valor > 0 para base e >= 1 para potencia!");
        }
         
         int i = 1;
         int valorEsperado = base;
         
         while(i < potencia){
             
             valorEsperado =  br.ufg.algoritmo4.Produto.produto(valorEsperado, base);
             i = i + 1;
         }
         
         return valorEsperado;
    }
    
}
