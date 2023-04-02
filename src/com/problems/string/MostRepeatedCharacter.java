package com.problems.string;


import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
    public static char mostRepeatedChar(String str) {
        char[] chars = str.toCharArray();
        char res = ' ';
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
                if (map.get(ch)>max) {
                    res = ch;
                    max = map.get(ch);
                }
            }else {
                map.put(ch, 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "greener green is greener than green";
        System.out.println("Most repeated character is '"+mostRepeatedChar(str)+"'");
    }
}

