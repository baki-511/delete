package com.problems.string;


import java.util.*;

/*
    Given an array of strings words (without duplicates), return all the concatenated words in the given list
     of words.

    A concatenated word is defined as a string that is comprised entirely of at least two shorter words
    (not necesssarily distinct) in the given array.

    Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
    Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
    Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats";
    "dogcatsdog" can be concatenated by "dog", "cats" and "dog";
    "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".

    Input: words = ["cat","dog","catdog"]
    Output: ["catdog"]
 */
public class ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<String,Boolean> hm = new HashMap<>();
        Set<String> hs = new HashSet<>();
        for (String word : words) {
            hs.add(word);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isConcatenated(words[i], hs, hm)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public boolean isConcatenated(String word, Set<String> set, Map<String, Boolean> hm) {
        if (hm.containsKey(word)) {
            return hm.get(word);
        }
        for (int i = 0; i < word.length(); i++) {
            String prefix = word.substring(0,i+1);
            String suffix = word.substring(i+1, word.length());

            if (set.contains(prefix) && set.contains(suffix) || set.contains(prefix) && isConcatenated(suffix, set, hm)) {
                hm.put(word,true);
                return true;
            }
        }
        hm.put(word,false);
        return false;
    }

    public static void main(String[] args) {
        ConcatenatedWords ob = new ConcatenatedWords();
        String[] arr = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        System.out.println(ob.findAllConcatenatedWordsInADict(arr));
    }
}
