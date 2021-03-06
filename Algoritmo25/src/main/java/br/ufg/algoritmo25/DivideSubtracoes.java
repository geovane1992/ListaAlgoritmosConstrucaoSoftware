package br.ufg.algoritmo25;

/**
 * Serviço oferecidos para cacular divisão de subtrações
 */

public class DivideSubtracoes {
    
    /**
     * @param x Recebe o valor1 de start para o calculo
     * @param y Recebe o valor2 de start para o calculo
     *
     * @return O resultado do calculo, ou seja, a divisão das subtrações.
     *
     * @throws IllegalArgumentException Caso o valor de x seja menor que 0  
     * ou o de y menor ou igual a 0.
     */
    
    public static double divideSubtracoes(double x, double y){
        
        if (x < 0 || y <= 0) {
            throw new IllegalArgumentException("Informe um valor válido para x e y!");
        }
        
        double valorEsperado = 0;
        double s = x;
        
        while(s >= y){
            s = s - y;
            valorEsperado = valorEsperado + 1;
            
        }
        
        return valorEsperado;
    }
    
}
