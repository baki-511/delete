package com.problems.others.recursion;

public class FactorialOfNum {
    public int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(new FactorialOfNum().factorial(5));
    }
}
