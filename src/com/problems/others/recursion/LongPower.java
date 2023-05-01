package com.problems.others.recursion;

public class LongPower {
    public long helper(int n, int pow){
        if (pow == 0) {
            return 1;
        }
        if (pow % 2 == 0) {
            return helper(n,pow/2) * helper(n,pow/2);
        }
        return helper(n,pow/2) * helper(n,pow/2) * n;
    }
    long power(int N,int R) {
        //Your code here
        int rev = 0;
        while (R > 0) {
            int d = R%10;
            rev = rev * 10 + d;
            R = R/10;
        }
        return helper(N,rev);

    }

    public static void main(String[] args) {
        System.out.println(new LongPower().helper(12,21));

    }

}
