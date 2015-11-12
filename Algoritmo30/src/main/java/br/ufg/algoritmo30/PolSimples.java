package br.ufg.algoritmo30;

/**
 * Método para calcular pol-simples.
 */


public class PolSimples {
    
       /**
     * @param x váriável1 que define a primeira entrada. 
     * @param g váriável2 que define a segunda entrada. 
     * @param a array de inteiros. 
     *
     * @return O valor do po-simples.
     * 
     * @throws IllegalArgumentException Caso a variável g for menor que 1 ou de a na posição 0 for igual a 0 entrará no Exception .
     */
    
    public static double polSimples(int x, int g, int[] a){
        if (g < 1 || a[0] == 0) {
                throw new IllegalArgumentException("Informe uma valor > 0 para a e > 0 para b!");
        }
        
        double potencia = br.ufg.algoritmo5.Potencia.potencia(x,g);
        double resultadoEsperado = a[3];
        int contador = 1;
        
        while(contador <= g){
            potencia = br.ufg.algoritmo5.Potencia.potencia(x,contador);
            resultadoEsperado = resultadoEsperado + a[contador] * potencia;
            contador = contador + 1;
        }
    return resultadoEsperado;
    }
    
}
