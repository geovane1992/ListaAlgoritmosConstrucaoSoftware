package br.ufg.algoritmo3;

/**
 * Método criado para calcular Somas Naturais
 */


public class somaNaturais{
    
    /**
     * Obtém o resultado de uma soma natural
     *
     * @param n váriável que define a quantidade de vezes que o loop irá rodar, entrada como parâmetro
     * @param i váriável de incremento.
     * @param s variavel que recebe o valor do calculo.
     *
     * @return O valor resultante do calculo será retornado a função pela variável s.
     *
     * @throws IllegalArgumentException Caso a variável n receba um valor menor que 1 entrará no Exception .
     */
    
    
    public static int somaNaturais (int n){

        if (n < 1) {
            throw new IllegalArgumentException("Informe um valor maior que 1 para n!");
        }
        
        int i = 2;
        int s = 1;
        
        while(i <= n){
            s = s + i;
            i = i + 1;
        }
               
        return s;
        
    }
            

  
    public static void main(String[] args) {
        
        System.out.println(somaNaturais(1));
    }
    
}