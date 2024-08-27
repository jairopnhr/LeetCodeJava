package com.example.facil.PalindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x )
    {
        boolean isNegative = (x<0);
        if(isNegative){return false ;}
        String number = Integer.toString(x);
        int left = 0;
        int right = number.length() - 1;
        
        while(left <right)
        {
            if (number.charAt(left)!= number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }return true ;
    }
    public static void main(String[] args) {
        int  palindrome1 = 131 ;
        System.out.println(" o Numero "+palindrome1+ (isPalindrome(palindrome1) ?" É um palimodro":" Não é um palimodro") );
    
    }

}
