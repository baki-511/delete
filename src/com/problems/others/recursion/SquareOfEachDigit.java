package com.problems.others.recursion;

public class SquareOfEachDigit {
    public static int sumOfSquareOfEachDigit(int num) {
        if (num < 10) {
            return num * num;
        }
        return (num % 10) * (num % 10) + sumOfSquareOfEachDigit(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquareOfEachDigit(157));
    }
}
