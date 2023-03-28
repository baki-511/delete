package com.problems.others;
/*
    Given an integer n, return true if it is a power of two. Otherwise, return false.

    An integer n is a power of two, if there exists an integer x such that n == 2x.

    Input: n = 16
    Output: true
    Explanation: 24 = 16

    Input: n = 3
    Output: false
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            else {
                n=n/2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PowerOfTwo ob = new PowerOfTwo();
        int n = 1024;
        System.out.println("Is "+n+" power of 2? = "+ob.isPowerOfTwo(n));
    }
}
