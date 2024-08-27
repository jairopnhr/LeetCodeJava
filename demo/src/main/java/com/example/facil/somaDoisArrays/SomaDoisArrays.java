package com.example.facil.somaDoisArrays;

import java.util.Arrays;

/**
 * SomaDoisArrays
 */
public class SomaDoisArrays {


    public static int[][] somaDoisArrays(int[][] array1,int[][]array2)
    {
        
        if (conferirTamanhoArray(array1, array2)) {
            int [][] novoArray = new int[array1.length][array1[0].length];
            for (int i = 0; i < novoArray.length; i++) {
                for (int j = 0; j < novoArray[i].length; j++) {
                    novoArray[i][j] = array1[i][j] + array2[i][j];
                }
           
            }
            return novoArray;
            
        }
        return new int[][]{{0},{0}};


    }
    public static int[][] squareArrays(int[][] array1)
    {
        int[][] novoArray = new int[array1.length][array1[0].length];


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                novoArray[i][j] =  array1[i][j]*array1[i][j];            
            }
        }
        return novoArray;
    }
    
    public static boolean conferirTamanhoArray(int[][] array1,int[][]array2)
    {
        
        return((array1 != null && array2 != null)&&(array1.length == array2.length && array1[0].length == array2[0].length));
    }

    
    public static void main(String[] args) {
        int[][] array1 = new int[][]{{3, 3, 3}, {4, 4, 4}};
        int[][] array2 = new int[][]{{3, 3, 3}, {4, 4, 4}};

        int[][] resultado = somaDoisArrays(array1, array2);
        int[][] resultado2 = squareArrays(array1);
        if (resultado != null) {
            for (int[] linha : resultado) {
                System.out.println(Arrays.toString(linha));
            }
        } else {
            System.out.println("Os arrays não têm o mesmo tamanho ou são nulos.");
        }

        if (resultado2 != null) {
        for (int[] linha : resultado2) {
            System.out.println(Arrays.toString(linha));
        }
    } else {
        System.out.println("Os arrays não têm o mesmo tamanho ou são nulos.");
    }
}

}