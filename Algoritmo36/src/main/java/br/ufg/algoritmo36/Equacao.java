package br.ufg.algoritmo36;

/**
 * Serviço oferecidos para realizar calculo de equação.
 */

public class Equacao {
    
    /**
     *
     * @return O resultado do calculo, ou seja, a quantidade de soluções.
     *
     */
    
    public static double equacao(){
        int contaSolucoes = 0;
        double x = 1;
        
        while(x <= 96){
            int y = 1;
            
            while(y <= 65){
               int z = 1;
               
               while(z <= 39){
                   int w = 1;
                   
                   while(w <= 28){
                       if((2 * x) + (3 * y) + (5 * z) + (7 * w) == 210){
                           contaSolucoes = contaSolucoes + 1;
                       }
                       w = w + 1;
                   }
                   z = z + 1;
               }
               y = y + 1;
            }
            x = x + 1;
        }
    return contaSolucoes;    
    }
    
}
