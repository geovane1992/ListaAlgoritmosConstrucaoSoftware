package br.ufg.algoritmo38;

/**
 * Método para calcular hipotenusa.
 */

public class Hipotenusa {
    
    /**
     * @param A váriável1 que define a primeira entrada. 
     * @param B váriável2 que define a segunda entrada. 
     *
     * @return O valor da hipotenusa.
     * 
     */
    
    public static double hipotenusa(int A, int B){
        double x = A * A;
        double y = B * B;
        double r = br.ufg.algoritmo29.RaizQuadrada.raizQuadrada(x, y);
       
     return r;   
    }
    
}
