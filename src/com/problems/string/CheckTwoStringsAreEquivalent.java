package com.problems.string;

/*
    Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of
     each letter from 'a' to 'z' between word1 and word2 is at most 3.

    Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent,
     or false otherwise.

    The frequency of a letter x is the number of times it occurs in the string.

    Input: word1 = "aaaa", word2 = "bccb"
    Output: false
    Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
    The difference is 4, which is more than the allowed 3.

    Input: word1 = "abcdeef", word2 = "abaaacc"
    Output: true
    Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
    - 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
    - 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
    - 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
    - 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
    - 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
    - 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.
 */
public class CheckTwoStringsAreEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int len = word1.length();
        int[] freq = new int[26];

        for (int i = 0; i < len; i++) {
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
        }
        for (int i=0; i<freq.length; i++){
            if (Math.abs(freq[i])> 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckTwoStringsAreEquivalent ob = new CheckTwoStringsAreEquivalent();
        String word1 = "abcdeef";
        String word2 = "abaaacc";

        System.out.println("Is two String are Equivalent = "+ob.checkAlmostEquivalent(word1,word2));
    }
}
