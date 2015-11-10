package br.ufg.algoritmo22;

/**
 * M�todo criado para calcular se 2 indiv�duos s�o amigos.
 */

public class Amigos {
    
    /**
     * @param n v�ri�vel1 que define o primeiro individuo. 
     * @param m v�ri�vel2 que define o segundo indiv�duo. 
     *
     * @return Se � ou nao amigos.
     * 
     * @throws IllegalArgumentException Caso a vari�vel n ou m receba um valor menor ou igual a 0 entrar� no Exception .
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
