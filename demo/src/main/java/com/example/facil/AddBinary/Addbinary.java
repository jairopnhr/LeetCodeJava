package com.example.facil.AddBinary;

public class Addbinary {
    
    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int sizeA = a.length()-1;
        int sizeB = b.length()-1;
        int carry = 0;
        while (sizeA >= 0 || sizeB >= 0 || carry == 1) {
            if (sizeA >= 0) {
                carry += a.charAt(sizeA--) - '0';
            }
            if (sizeB >= 0) {
                carry += b.charAt(sizeB--) - '0';
            }
            builder.append(carry % 2);
            carry /= 2;
        } if (carry != 0) {
            builder.append(carry);
        }
        
        return builder.reverse().toString();
    }
public static void main(String[] args) {
    System.out.println(addBinary("1001", "1101"));
}

}
