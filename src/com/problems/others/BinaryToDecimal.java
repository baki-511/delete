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

    public static int binaryToDec(long bin) {
        long temp = bin;
        int sum = 0;
        int count = 0;
        while (temp > 0) {
            int d = (int) (temp % 10);
            if (d == 1) {
                sum = (int) (sum + Math.pow(2, count));
            }
            temp = temp / 10;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        String bin = "101110011011";
        long num = 101110011011L;
        System.out.println("Binary num = "+bin+"\nDecimal Num = "+convertToDec(bin));
        System.out.println("\nBinary num = "+bin+"\nDecimal Num = "+binaryToDec(num));
    }
}
