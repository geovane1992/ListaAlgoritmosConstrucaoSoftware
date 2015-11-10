package br.ufg.algoritmo41;

/**
 * Serviço oferecidos para inverter caracteres de uma string.
 */


public class InverteCaracteres {
    
    /**
     * @param string Recebe o valor a ser invertido
     *
     * @return A palavra invertida.
     *
     * @throws IllegalArgumentException Caso o valor passado não contenha nenhum caracter retorna uma exceção.
     */
    
    public static String inverteCaracteres(String string){
        
        if (string.length() == 0) {
                throw new IllegalArgumentException("Informe uma string válida!");
        }
        
        if (string.length() == 1){
            return string;
        }
        else{
            int tamanho = string.length();
            char ultimoCaracter = string.charAt(string.length() - 1);
            
            String string2 = string.substring(0, tamanho-1);
            
            return ultimoCaracter + inverteCaracteres(string2);
        }

    }
    
}
