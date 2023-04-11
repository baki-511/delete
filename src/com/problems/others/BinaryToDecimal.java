package com.problems.others;

public class BinaryToDecimal {
    public static int convertToDec(String num) {
        char[] arr = num.toCharArray();
        int count = 0;
        int sum = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] == '1') {
                sum = (int) (sum + Math.pow(2, count));
            }
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        String bin = "10001010";
        System.out.println("Binary num = "+bin+"\nDecimal Num = "+convertToDec(bin));
    }
}
