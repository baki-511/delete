package com.problems.others.pattern;

//You have a sequence 2,5,16,65,........Given an integer n as input.You have to find the value at the nth position
//        in the sequence.

//            Input: n = 4
//            Output: 65


public class SequenceFun {
    public int NthTerm(int n) {
        // code here
        if (n == 1) {
            return 2;
        }
        return NthTerm(n - 1) * n + 1;
    }
    public int NthTerm2(int n) {
        // code here
        long prev = 2L;
        long mod = 1000000000L;
        for (int i = 2; i <= n; i++) {
            long curr = (prev%mod * i%mod)+1;
            prev = curr;
        }
        return (int) prev;
    }

    public static void main(String[] args) {
        System.out.println(new SequenceFun().NthTerm(4));
        System.out.println(new SequenceFun().NthTerm2(4));
    }
}
