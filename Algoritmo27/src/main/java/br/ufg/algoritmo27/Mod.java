package br.ufg.algoritmo27;

/**
 * Serviço oferecidos para cacular mod.
 */

public class Mod {
    
    /**
     * @param x Recebe o valor1 de start para o calculo
     * @param y Recebe o valor2 de start para o calculo
     *
     * @return O resultado do calculo, ou seja, mod de x por y.
     *
     * @throws IllegalArgumentException Caso o valor de x seja menor que 0  
     * ou o de y menor ou igual a 0.
     */
    
    public static double mod(double x, double y){
        
        if (x < 0 || y <= 0) {
            throw new IllegalArgumentException("Informe um valor válido para x e y!");
        }
        
        double valorEsperado = x;
        
        while(valorEsperado >= y){
            
            valorEsperado = valorEsperado - y;
            
        }
        
        return valorEsperado;
    }
    
}
