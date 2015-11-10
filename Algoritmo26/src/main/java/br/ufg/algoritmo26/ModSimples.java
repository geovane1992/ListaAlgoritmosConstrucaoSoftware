package br.ufg.algoritmo26;

/**
 * Método criado para calcular mod.
 */

public class ModSimples {
    
    /**
     * @param x váriável1 que define a primeira entrada. 
     * @param y váriável2 que define a segunda entrada. 
     *
     * @return O valor de mod.
     * 
     * @throws IllegalArgumentException Caso a variável x ou y receba um valor menor ou igual a 0 entrará no Exception .
     */
    
    public static double modSimples(int x, int y){
        if (x <= 0 || y <= 0) {
                throw new IllegalArgumentException("Informe uma valor > 0 para x e > 0 para y!");
         }
        
        double d = br.ufg.algoritmo25.DivideSubtracoes.divideSubtracoes(x,y);
        
     return x - (d * y);
    }
    
}
