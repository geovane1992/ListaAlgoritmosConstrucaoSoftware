package br.ufg.algoritmo22;

/**
 * Método criado para calcular se 2 indivíduos são amigos.
 */

public class Amigos {
    
    /**
     * @param n váriável1 que define o primeiro individuo. 
     * @param m váriável2 que define o segundo indivíduo. 
     *
     * @return Se é ou nao amigos.
     * 
     * @throws IllegalArgumentException Caso a variável n ou m receba um valor menor ou igual a 0 entrará no Exception .
     */
    
    public static boolean amigos(int n, int m){
        if (n <= 0 || m <= 0) {
                throw new IllegalArgumentException("Informe uma valor > 0 para n e > 0 para m!");
         }
        
        double sn = br.ufg.algoritmo23.SomaDivisores.somaDivisores(n);
        double sm = br.ufg.algoritmo23.SomaDivisores.somaDivisores(m);
        
        if(sn == m && sm == n){
            return true;
        }
        else{
            return false;
        }
    }
}
