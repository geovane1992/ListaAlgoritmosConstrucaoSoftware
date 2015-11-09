package br.ufg.algoritmo29;

/**
 * Serviço oferecidos para cacular a raiz quadrada.
 */

public class RaizQuadrada {
    
    /**
     * @param n Recebe o valor ao qual se procura a raiz quadrada
     * @param contador Recebe o valor usado como contador
     *
     * @return O resultado do calculo, ou seja, raiz quadrada de n.
     *
     * @throws IllegalArgumentException Caso o valor de n seja menor ou igual a 0.
     */
    
    public static double raizQuadrada(double n, double contador){
    
        if (n <= 0) {
                throw new IllegalArgumentException("Informe um valor válido maior que 0 para n!");
         }
        
        double valorEsperado = 1;

    
        while(contador >= 0){
            valorEsperado = (valorEsperado + (n/valorEsperado) / 2);
            contador = contador - 1;

        }
        
        return valorEsperado;
    }

}
