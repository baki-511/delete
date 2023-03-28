package com.problems.string;

import java.util.HashMap;

/*
    Given a pattern and a string s, find if s follows the same pattern.
    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty
    word in s.

    Input: pattern = "abba", s = "dog cat cat dog"
    Output: true

    Input: pattern = "abba", s = "dog cat cat fish"
    Output: false
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = hm.containsKey(ch);
            if (hm.containsValue(arr[i]) && !containsKey) {
                return false;
            }
            if (containsKey && !hm.get(ch).equals(arr[i])) {
                return false;
            }
            else {
                hm.put(ch,arr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern w = new WordPattern();
        String s= "dog cat cat dog";
        String pattern = "abba";

        System.out.println("Is pattern match ? = "+w.wordPattern(pattern,s));
    }
}
