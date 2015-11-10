package br.ufg.algoritmo37;

/**
 * Serviço oferecidos para realizar calculo de ackerman.
 */

public class Ackerman {
    
    /**
     * @param x Recebe o valor1 de entrada para o calculo
     * @param y Recebe o valor2 de entrada para o calculo
     *
     * @return O resultado do calculo, ou seja, o valor ackerman.
     *
     * @throws IllegalArgumentException Caso o valor de x ou y seja menor que 0.
     */
    
    public static double ackerman(double x, double y){
        if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Informe um valor maior ou igual a 0 para x e para y!");
        }
        
        if(x == 0 ){
            return y + 1;
        }
        if(y == 0){
            return ackerman(x - 1, 1);
        }
        
        return ackerman(x -1, ackerman(x, y - 1));
    }
    
}
