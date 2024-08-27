package com.example.Busca;

public class BuscaLinear {
    public static int buscaLinear (int[] array , int target )
    {
        int tamanho = array.length -1;
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array =  new int[] {3, 7, 12, 18, 25, 33, 40, 48, 55, 62, 78, 91, 102, 115, 130, 150};
        Long inicio = System.currentTimeMillis();
        System.out.println(buscaLinear(array, 78));
        Long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução :"+(fim - inicio));

    }
}