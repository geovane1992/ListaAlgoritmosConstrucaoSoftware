package br.ufg.algoritmo39;

/**
 * Método para calcular Propriedade.
 */

public class Propriedade {
    
    public static double propriedade(){
        int valorEsperado = 0;
        int contador = 2005;
        
        while(contador < 2000){
            if(br.ufg.algoritmo40.AtendeSomaFatDigitos.atendeSomaFatDigitos(contador)){
                valorEsperado = valorEsperado + 1;
            }
            contador = contador + 1;
        }
    return valorEsperado;
        
    }
    
}
