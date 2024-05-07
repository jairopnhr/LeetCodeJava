package com.example.facil.RemoveDuplicates;

public class RemoveDuplicates {
    
    public static int removeDuplicates(int[] nuns)
    {
        int j = 1;
        for (int i = 1; i < nuns.length; i++) {
            if (nuns[i]!= nuns[i-1]) {
                nuns[j]= nuns[i];
                j++;
            }
        }
        return j ;
    }
    public static void main(String[] args) {
        int[] nuns = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nuns));
    }
}
