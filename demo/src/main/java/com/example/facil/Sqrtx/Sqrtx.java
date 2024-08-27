package com.example.facil.Sqrtx;

public class Sqrtx {
    public static int mySqrt(int x) {
        if (x ==0||x==1) {
            return x;
        }
        long start =1;
        long end = x;
        long res = 0;
        while (start<=end) {
            long mid = start + (end - start)/2;
            boolean isigual = mid*mid==x;
            boolean ismenor = mid*mid<x;
            if (isigual) {
                res = (int)mid;
                break;
            }else if (ismenor) {
                start = mid+1;
                res = mid;
            }else{
                end = mid-1;
            }
        
        }
        return (int)res;

    }  
    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
