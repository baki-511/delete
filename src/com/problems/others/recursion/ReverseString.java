package com.problems.others.recursion;

public class ReverseString {
    public static String reverseString(String str) {
        if ((str==null)||(str.length() <= 1))
            return str;
        else
        {
            System.out.print(str.charAt(str.length()-1));
            return reverseString(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original = "+str);
//        System.out.println("Reverse = "+reverseString(str));
        System.out.println(reverseString(str));
    }

}
