package com.problems.others;

/*
    Given an Integer num, repeatedly add its digits until the result has
    only one digit and return it.

    Input = 38
    output : 2
    38 --> 3 + 8 --> 11
    11 --> 1 + 1 --> 2
    since 2 has only one digit, return it.
 */
public class AddDigit {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num%9==0)?9:num%9;
    }

    public static void main(String[] args) {
        AddDigit ob = new AddDigit();
        int num = 27;
        System.out.println(ob.addDigits(num));
    }
}
