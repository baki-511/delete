package com.problems.string;

public class Palindrome {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String str = "A man, a plan, a canal: Panama";
        System.out.println("is '"+str+"' palindrome = "+palindrome.isPalindrome(str));
    }
}
