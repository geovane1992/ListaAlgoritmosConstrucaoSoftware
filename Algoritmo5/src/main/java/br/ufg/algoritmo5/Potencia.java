package br.ufg.algoritmo5;

/**
 * Serviços oferecidos verificar o resultado da potencia de um numero.
 */


public class Potencia {
    
    /**
     * @param base A base da potencia.
     * @param potencia a potencia da base.
     *
     * @return O valor do calculo da potencia.
     *
     * @throws IllegalArgumentException Caso o valor da base ou da potencia sejam invalidos
     * retorna uma exceção.
     */

    public static int potencia(int base, int potencia){
        if (base <= 0 || potencia < 0) {
            throw new IllegalArgumentException("Informe uma valor > 0 para x e >= 0 para y!");
        }
        
        int contador = 1;
        int resultadoEsperado = 1;
        
        while( contador <= potencia){
            
            resultadoEsperado = resultadoEsperado*base;
            contador = contador + 1;
        }
        
    return resultadoEsperado;
    }
    
}
