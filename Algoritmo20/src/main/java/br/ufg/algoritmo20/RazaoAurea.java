package br.ufg.algoritmo20;

/**
 * Método criado para calcular rezão aurea.
 */

public class RazaoAurea {
    
    /**
     * @param termo1  váriável1 que recebe o valor de entrada para o calculo.  
     * @param termo2  váriável2 que recebe o valor de entrada para o calculo.  
     * @param fator   váriável3 que recebe o valor de entrada para o calculo.  
     * 
     * @return O valor resultante do calculo será retornado a função.
     *
     * @throws IllegalArgumentException Caso as variáveis termo1, termo2 ou fator sejam menor ou igual a 0 retornará uma exceção.
     */
    
    public static double razaoAurea(double termo1, double termo2, double fator){
           
        if (termo1 <= 0 || termo2 <= 0 || fator <= 0) {
                      throw new IllegalArgumentException("Informe uma valor valido >= a 1 para n e >= 2 para k!");
           }
        
        double termoCorrente = termo2;
        double termoAnterior = termo1;
        double i = 1;
        
        while(i <= fator){
            
            termoCorrente = termoCorrente + termoAnterior;
            termoAnterior = termoCorrente - termoAnterior;
            i = i + 1;
            
        }
        
        return termoCorrente/termoAnterior;
        
    }
     
}
