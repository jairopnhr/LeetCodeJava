package com.example.medio;
import java.util.Arrays;
public class ReverseString {
    

    public static char[] reverseString(char[] array ){
        int inicio = 0;
        int fim = array.length-1;

        while (inicio < fim) {
            char temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
            return array;
    }
    
public static void main(String[] args) {
    System.out.println(Arrays.toString( reverseString(new char[]{'h','e','l','l','o','w','o'})));
}

}
