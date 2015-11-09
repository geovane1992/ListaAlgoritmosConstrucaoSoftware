package br.ufg.algoritmo22;

/**
 * Serviço oferecidos para cacular se duas pessoas são amigas
 */

public class Amigoss {
    
    /**
     * Vedrifica se dias pessoa são amigas.
     *
     * @return O valor true se forem amigas e false caso não sejam.
     *
     * @throws IllegalArgumentException Caso o valor dos parâmetros sejam 
     * menores ou igual a 0.
     */

    public static double somaDivisores(double x){
        
        if (x <= 0) {
            throw new IllegalArgumentException("Informe um valor válido para n!");
        }
        
       double d = 2;
       double s = 1;
       
       while(d <= (x/2)){
           if((x%d) == 0){
               s = s + d;
           }
           d = d + 1;
       }
       return s;
    }
    
    public static boolean amigos(double n, double m){
        
         if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("Informe um valor maior que 0 para n e m!");
        }
         
         double sn = somaDivisores(n);
         double sm = somaDivisores(m);

         
         if(sn == m && sm == n){
             return true;
         }else{
             return false;
         }
    }
}
