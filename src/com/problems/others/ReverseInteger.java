package com.problems.others;

public class ReverseInteger {
    public int reverseNum(int n){
        int temp = n;
        int rev = 0;
        while (temp>0){
            int d = temp%10;
            if (rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev * 10 + d;
            temp/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger reverse = new ReverseInteger();
        int num = 1234;
        System.out.println("Number = "+num);
        System.out.println("Reverse number = "+reverse.reverseNum(num));
    }
}
