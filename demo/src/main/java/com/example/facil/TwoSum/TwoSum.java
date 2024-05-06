package com.example.facil.TwoSum;

import java.util.Arrays;

public class TwoSum 
{
    public static int[] twoSum(int[]nums ,int target)
    {
        int[]result = new int[2];
        int size = nums.length;
        for(int indexI =0 ;indexI < size -1; indexI ++){
            for (int indexJ = indexI + 1; indexJ < size; indexJ++) {
                if (nums[indexI] + nums[indexJ] == target){
                    result[0]=indexI;
                    result[1]=indexJ;
                    return result;
                }
            }
            
        }
    return new int[]{};
    }

    public static void main(String[] args) {
        int[]nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}