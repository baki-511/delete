package com.problems.others.recursion;

public class EvenSum {
    public static int evenSum(int start,int end, int sum) {
        if (start > end) {
            return sum;
        }
        sum = sum + start;
        return evenSum(start + 2, end, sum);
    }

    public static void main(String[] args) {
        System.out.println(evenSum(0, 8, 0));;
    }
}
