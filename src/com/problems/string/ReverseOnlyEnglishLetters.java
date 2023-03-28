package com.problems.string;

public class ReverseOnlyEnglishLetters {
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] ch = s.toCharArray();
        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start++;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            }else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        ReverseOnlyEnglishLetters ob = new ReverseOnlyEnglishLetters();
        String str = "a-bC-dEf-ghIj";
        System.out.println("Before reversing = "+str);
        System.out.println("After reversing = "+ob.reverseOnlyLetters(str));
    }
}
