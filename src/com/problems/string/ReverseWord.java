package com.problems.string;

public class ReverseWord {
    public String reverseWords(String str){
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i= words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        String str = "   a     good       example     ";
        System.out.println(str);
        System.out.println(reverseWord.reverseWords(str));
    }
}
