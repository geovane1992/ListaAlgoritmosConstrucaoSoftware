package br.ufg.algoritmo38;

/**
 * M�todo para calcular hipotenusa.
 */

public class Hipotenusa {
    
    /**
     * @param A v�ri�vel1 que define a primeira entrada. 
     * @param B v�ri�vel2 que define a segunda entrada. 
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
