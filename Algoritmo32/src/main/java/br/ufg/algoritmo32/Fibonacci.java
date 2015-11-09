package br.ufg.algoritmo32;

/**
 * Serviço oferecidos para realizar calculo de fibonacci.
 */

public class Fibonacci {
    
    /**
     * @param n Recebe o valor ao qual se procura fibonacci
     *
     * @return O resultado do calculo, ou seja, o valor fibonacci.
     *
     * @throws IllegalArgumentException Caso o valor de n seja menor ou igual a 0.
     */
    
    public static double fibonacci(double n){
        
        if (n <= 0) {
                throw new IllegalArgumentException("Informe um valor válido maior que 0 para n!");
         }
        
        double termoAnterior = 0;
        double termoCorrente = 1;
        
        if(n == 0 || n == 1){
            return n;
        }
        double i = 2;
        
        while(i <= n){
            double t = termoCorrente;
            termoCorrente = termoCorrente + termoAnterior;
            termoAnterior = t;
            i = i + 1;
        }
        
    return termoCorrente;
    }
    
}
