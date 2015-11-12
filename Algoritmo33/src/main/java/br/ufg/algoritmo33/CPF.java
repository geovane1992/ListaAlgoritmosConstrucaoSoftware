package br.ufg.algoritmo33;

/**
 * Método para calcular validade de cpf.
 */

public class CPF {
    
     /**
     * @param d vetor que recebe cpf. 
     *
     * @return Se é válido ou não.
     * 
     */
    
    public static boolean cpf(long d[]){
        
        d[0] = 0;
        
        long sj = d[1] + (2*d[2]) + (3*d[3]) + (4*d[4]) + (5*d[5]) + (6*d[6]) + (7*d[7]) + (8*d[8]) + (9*d[9]);
        long sk = d[2] + (2*d[3]) + (3*d[4]) + (4*d[5]) + (5*d[6]) + (6*d[7]) + (7*d[8]) + (8*d[9]) + (9*d[10]);
        
        long j = (sj%11)%10;
        long k = (sk%11)%10;
        
        if(j == d[10] && k == d[11]){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
    
}
