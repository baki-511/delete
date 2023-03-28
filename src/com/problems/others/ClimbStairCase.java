package com.problems.others;

/*
    You are climbing a staircase. It takes n steps to reach top.
    Each time you can either climb 1 or 2 steps. In how many ways you climb to top?

    Input n = 2
    output = 2

    Input n = 5
    output = 8
 */
public class ClimbStairCase {
    public int climStairCases(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 3, b = 2;
        for (int i = 0; i < n - 3; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }

    public static void main(String[] args) {
        ClimbStairCase ob = new ClimbStairCase();
        System.out.println(""+ob.climStairCases(5));
    }
}
