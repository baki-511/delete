package com.problems.others.pattern;

public class Pattern1 {
    public void printPat(int n) {

       /* for (int i = n; i >= 1; i--) {
            int count = i;
            while (count >= 1) {
                System.out.print(i);
                count--;
            }
            System.out.println("$");

        }*/
        int count = n;
        for (int i = n; i >= 1; i--) {
            while (count >= 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count+" ");
                }
                count--;
            }
            count = n;
            System.out.print("$");
        }
    }


    public static void main(String[] args) {
        new Pattern1().printPat(3);
    }
}
