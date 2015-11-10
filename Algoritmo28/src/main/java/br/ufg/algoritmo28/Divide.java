package br.ufg.algoritmo28;

/**
 * M�todo Divide.
 */


public class Divide {
    
     /**
     * @param a v�ri�vel1 que define a primeira entrada. 
     * @param b v�ri�vel2 que define a segunda entrada. 
     * @param k v�ri�vel3 que define a terceira entrada. 
     *
     * @return O valor de divide.
     * 
     * @throws IllegalArgumentException Caso a vari�vel a ou b receba um valor menor ou igual a 0 entrar� no Exception .
     */
    
    public static void divide(int a, int b, int k){
        if (a <= 0 || b <= 0) {
                throw new IllegalArgumentException("Informe uma valor > 0 para a e > 0 para b!");
         }
        
        double d = br.ufg.algoritmo24.DivideSomas.divideSomas(a,b);
        
        System.out.println(d);
        
        int r = (int) br.ufg.algoritmo27.Mod.mod(a,b);
        
        if(r != 0){
            System.out.println(",");
        }
        
        while(r != 0 && k > 0){
            r = br.ufg.algoritmo4.Produto.produto(10,r);
            d = br.ufg.algoritmo24.DivideSomas.divideSomas(r,b);
            
            System.out.println(d);
            
            r = (int) br.ufg.algoritmo27.Mod.mod(r,b);
            k = k - 1;
        }
    }
    
}
