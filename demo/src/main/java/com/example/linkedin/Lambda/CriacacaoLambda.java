package com.example.linkedin.Lambda;

@FunctionalInterface
 interface Fatoriavel {
   int fatorial(int nun);
}

public class CriacacaoLambda {
    public static void main(String[] args) {
        Fatoriavel fatoriavel    = n -> { 
           
           
            int resultado = 1;
            for(int i = 1 ; i <= n ; i++){
                resultado *= i ;
            }
            return resultado;
        };
   System.out.println(fatoriavel.fatorial(5));
    }
        

}