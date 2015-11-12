package br.ufg.algoritmo40;

/**
 * Método para calcular soma fatorial.
 */


public class AtendeSomaFatDigitos{
    
     /**
     * @param v váriável que define a valor de entrada.  
     */
    
    public static boolean atendeSomaFatDigitos(double n){
        double a  = n / 100;
        double b = ((n - 100) * a)/10;
        double c = n%10;
        
        double s = br.ufg.algoritmo16.Fatorial.fatorial(a) + br.ufg.algoritmo16.Fatorial.fatorial(b) + br.ufg.algoritmo16.Fatorial.fatorial(c);
        
        if(s == n){
            return true;
        }
        else{
            return false;
        }
    }
    
}
