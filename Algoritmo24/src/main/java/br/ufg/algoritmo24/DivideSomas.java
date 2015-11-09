package br.ufg.algoritmo24;

/**
 * Serviço oferecidos para cacular divisão de somas
 */

public class DivideSomas {
    
    /**
     * @param x Recebe o valor1 de start para o calculo
     * @param y Recebe o valor2 de start para o calculo
     *
     * @return O resultado do calculo, ou seja, a divisão das somas..
     *
     * @throws IllegalArgumentException Caso o valor de x seja menor que 0  
     * ou o de y menor ou igual a 0.
     */
    
    public static double divideSomas(double x, double y){
        
        if (x < 0 || y <= 0) {
            throw new IllegalArgumentException("Informe um valor válido para x e y!");
        }
        
        if (x < y) {
            throw new IllegalArgumentException("O valor de X deve ser maior que o de Y!");
        }
        
        double valorEsperado = 0;
        double s = y;
        
        while(s <= x){
            s = s + y;
            valorEsperado = valorEsperado + 1;
        }
        
        return valorEsperado;
    }
    
}
