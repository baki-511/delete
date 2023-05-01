package com.problems.others;

import java.util.Scanner;

public class PowerOfNumber {
    public long powerOfNum(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow % 2 == 0) {
            return powerOfNum(n, pow / 2) * powerOfNum(n, pow / 2);
        }else {
            return powerOfNum(n, pow / 2) * powerOfNum(n, pow / 2) * n;
        }
    }

    public static void main(String[] args) {
        PowerOfNumber p = new PowerOfNumber();
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the number = ");
//        int num = sc.nextInt();
//
//        System.out.print("Enter the power = ");
//        int power = sc.nextInt();
//
//        System.out.println(num+" to the power "+power+" = "+p.powerOfNum(num,power));
        System.out.println(new PowerOfNumber().powerOfNum(12,21));
    }
}
