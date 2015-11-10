package br.ufg.algoritmo6;

/**
 * Serviço oferecidos para calcular potencia.
 */


public class PotenciaSoma {
    
    /**
     * @param base Recebe os valores da base 
     * @param potencia Recebe o valor da potência
     *
     * @return O valor do calculo da potência
     * 
     * @throws IllegalArgumentException Caso o valor passado para base seja menor ou igual a 0 ou o da potência for menor que 1 retorna uma exceção.
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
