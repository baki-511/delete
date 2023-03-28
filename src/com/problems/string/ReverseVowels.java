package com.problems.string;

public class ReverseVowels {
    public String reverseVowel(String str){
        int start = 0;
        int end = str.length()-1;
        char[] ch = str.toCharArray();
        while (start < end){
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);
            if (!isVowel(ch[start])){
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
           else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    public boolean isVowel(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ReverseVowels vowels = new ReverseVowels();
        String str = "hello";
        System.out.println("String = "+str);
        System.out.println("Reversing string = "+vowels.reverseVowel(str));
    }
}
