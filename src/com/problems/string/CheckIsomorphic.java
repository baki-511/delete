package com.problems.string;

import java.util.HashMap;

public class CheckIsomorphic {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> hm = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (hm.containsKey(s.charAt(i))){
                if (!hm.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else {
                if (hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIsomorphic isomorphic = new CheckIsomorphic();
        String s = "foo";
        String t = "baa";
        System.out.println(isomorphic.isIsomorphic(s,t));
    }
}
