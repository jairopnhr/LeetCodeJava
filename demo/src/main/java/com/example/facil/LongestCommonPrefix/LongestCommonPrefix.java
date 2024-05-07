package com.example.facil.LongestCommonPrefix;

/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) 
    {
        if(strs.length ==0 || strs == null){
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
           
            while(!strs[i].startsWith(prefix))
            {
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
   
    public static void main(String[] args) {
        String[] prefixs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(prefixs));
    
    }
}