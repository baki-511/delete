package com.problems.others;

public class CheckPalindrome {
    public boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while (temp>0){
            int d = temp%10;
            rev= rev*10 + d;
            temp/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckPalindrome palindrome = new CheckPalindrome();
        if (palindrome.isPalindrome(4646)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
