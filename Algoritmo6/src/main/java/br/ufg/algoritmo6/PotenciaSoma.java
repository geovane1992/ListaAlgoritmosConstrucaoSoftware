package br.ufg.algoritmo6;


public class PotenciaSoma {
    
    public static double potenciaSoma(double base, double potencia){
        
         if (base <= 0 || potencia < 1) {
            throw new IllegalArgumentException("Informe uma valor > 0 para base e >= 1 para potencia!");
        }
         
         double i = 1;
         double p = base;
         
         while(i < potencia){
             
             p = br.ufg.algoritmo4.Produto(p, base);
             i = i + 1;
         }
         
         return p;
    }
    
}
