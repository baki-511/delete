package com.problems.string;

public class FirstUniqueChar {
    public int firstUniqueCharIdx(String str){
        int[] freq = new int[26];
        char[] chars = str.toCharArray();
        for (char c : chars){
            freq[c - 'a']++;
        }
        for (int i=0; i<chars.length; i++){
            if (freq[chars[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueChar first = new FirstUniqueChar();
        String str = "leetcode";
        System.out.println(first.firstUniqueCharIdx(str));
    }
}
