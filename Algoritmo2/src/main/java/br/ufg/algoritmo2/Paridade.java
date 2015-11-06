
package br.ufg.algoritmo2;

/**
 * Serviços oferecidos para verificar
 * se um numero é par ou não.
 */


public class Paridade {
    
    /* @param n Recebe o valor a ser testado.
     *
     * @return retorna true se foi par e false se for impar. 
    */
    
    public static boolean paridade(int n){
        
        if( n%2 == 0 ){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
