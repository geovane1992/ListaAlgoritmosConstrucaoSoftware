package br.ufg.algoritmo31;

public class PolHorner {
    
    public static double polHorner(double x, double g, double ag){
        
        if (g < 1) {
                throw new IllegalArgumentException("Informe um valor maior ou igual a 1 para g!");
        }
        
        double p = ag;
        double i = g - 1;
        
        while(i >= 0){
            p = (p * x) + (a * i);
            i = i - 1;
        }
    return p;
    }
    
}
