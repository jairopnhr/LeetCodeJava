package com.example.facil.PlusOne;
import java.util.Arrays;
public class PlusOne {
    public static int[] plusOne(int[] digits)
    {
        int tamanho = digits.length -1;
        for(int index = tamanho; index >=0 ; index--)
        {
            if(digits[index]<9){
                digits[index]++;
                return digits;
            }
            digits[index]=0;
        
        }
      int[]newDigits = new int[digits.length + 1];
      newDigits[1]=0;
      return newDigits;
    }

public static void main(String[] args) {
    int[] digits = new int[]{1,2,3,4,9};
    System.out.println(Arrays.toString(plusOne(digits)));

}
}
