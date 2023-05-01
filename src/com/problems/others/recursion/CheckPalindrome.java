package com.problems.others.recursion;

public class CheckPalindrome {
    public boolean checkPalindrome(String str){
        return helper(str, 0, str.length() - 1);
    }

    private boolean helper(String str, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return helper(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        System.out.println(new CheckPalindrome().checkPalindrome("nitin"));
    }
}
