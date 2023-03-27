package com.problems.string;

import java.util.Arrays;

public class CheckAnagram {
    public boolean isAnagram(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1,ch2)){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        CheckAnagram check = new CheckAnagram();
        String str1 = "feek";
        String str2 = "keep";
        if (check.isAnagram(str1,str2)){
            System.out.println(str1+" and "+str2+" are Anagrams");
        }
        else {
            System.out.println(str1+" and "+str2+" are NOT Anagrams");

        }
    }
}
