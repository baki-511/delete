package com.problems.string;

public class ReverseString {
    public void reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
           sb.append(str.charAt(i));
        }
        System.out.println("Reversed String = "+sb);
    }

    public static void main(String[] args) {
        ReverseString ob = new ReverseString();
        String str = "yamato";
        ob.reverseString(str);
    }
}
