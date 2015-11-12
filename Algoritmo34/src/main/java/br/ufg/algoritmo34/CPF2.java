package br.ufg.algoritmo34;

/**
 * Método para validar cpf.
 */

public class CPF2 {
    
    /**
     * @param d Array que recebe o cpf. 
     *
     * @return Verdadeiro para válido e falso para inválido.
     * 
     */
    
    public static boolean cpf2(long d[]){
         int c = 8;
         long p = d[9];
         long s = d[9];
         
         while(c >= 1){
             p = p + d[c];
             s = s + p;
             c = c - 1;
         }
         double j = (s%11)%10;
         double k = ((s - p + (9 * j))%11)%10;
         
         if(j == d[10] && k == d[11]){
             return true;
         }
         else{
             return false;
         }
    }
    
}
