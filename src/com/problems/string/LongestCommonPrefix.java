package com.problems.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index =0;
        while (index<str1.length()){
            if (str1.charAt(index)==str2.charAt(index)){
                index++;
            }else {
                break;
            }
        }
        return index==0?"":str1.substring(0,index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] strs = {"aniket", "anita", "anirudh" };
        System.out.println(prefix.longestCommonPrefix(strs));
    }
}
