package com.example.facil.RomanToInteger;

public class RomanToInteger {
    public static int romanToInt(String s)
    {
        char[]symbol = new char[]{'I','V','X','L','C','D','M'};
        int[]values = new int[]{1,5,10,50,100,500,1000};
        
        char[] input = s.toCharArray();
        int result = 0;

        for (int index = 0; index < input.length; index++) {
            int current = getValue(symbol,values,input[index]);
            if (index +1 < input.length && getValue(symbol, values, input[index+1])> current){
                result -= current;
            }else{
                result += current;
            }
        }
        return result;
    }

    private static int getValue(char[] symbol, int[] values, char c) {
        for (int i = 0; i < symbol.length; i++) {
            if (symbol[i]== c) {
                return values[i];
            }
        }
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("X"));
    }
}
