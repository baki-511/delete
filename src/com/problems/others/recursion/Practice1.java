package com.problems.others.recursion;

public class Practice1 {
    static int product(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + product(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(product(8, 7));
    }
}
