package com.example.Busca;

public class BuscaBinaria {
    public static int buscaBinaria(int[] array , int target)
    {
        int inicio = 0;
        int fim = array.length - 1;
        while (inicio<= fim) {
            int meio = (inicio + fim)/2;
            if(array[meio]== target)
            {
                return meio;
            }
            else if (array[meio]>target) {
                fim =   meio - 1;
            }else  {
                inicio=   meio + 1;
            }
        }
        return -1;
    }    
    public static void main(String[] args) {
      
        int[] array =  new int[] {3, 7, 12, 18, 25, 33, 40, 48, 55, 62, 78, 91,102};
        Long inicio = System.currentTimeMillis();
        System.out.println(buscaBinaria(array,62 ));
        Long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução :"+((fim - inicio)/1000.0));

    }


}
