package com.problems.others.recursion;

public class SumOFNum {
    public int sumOfNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNatural(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(new SumOFNum().sumOfNatural(10));
    }
}
