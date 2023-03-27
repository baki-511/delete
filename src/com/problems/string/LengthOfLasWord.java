package com.problems.string;

public class LengthOfLasWord {
    public int lengthOfLastWord(String s){
        String str = s.trim();
        int count = 0;
        for (int i=str.length()-1; i>=0; i--){
            if (str.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLasWord lasWord = new LengthOfLasWord();
        String str = "fly to the moon";
        System.out.println("Length of Last word = "+lasWord.lengthOfLastWord(str));
    }
}
