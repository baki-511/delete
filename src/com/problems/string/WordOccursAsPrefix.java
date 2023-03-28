package com.problems.string;

/*
    Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is
     a prefix of any word in sentence.

    Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is
     a prefix of more than one word, return the index of the first word (minimum index). If there is no such word
     return -1.

    A prefix of a string s is any leading contiguous substring of s.

    Input: sentence = "i love eating burger", searchWord = "burg"
    Output: 4
    Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.

    Input: sentence = "i am tired", searchWord = "you"
    Output: -1
    Explanation: "you" is not a prefix of any word in the sentence.

 */
public class WordOccursAsPrefix {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        WordOccursAsPrefix w = new WordOccursAsPrefix();
        String sentence = "i love eating burger", searchWord = "burg";
        System.out.println("index = "+w.isPrefixOfWord(sentence,searchWord));
    }
}
