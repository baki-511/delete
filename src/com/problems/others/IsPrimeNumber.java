package com.problems.others;

public class IsPrimeNumber {
    public boolean isPrimeNumber(int n){
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPrimeNumber ob = new IsPrimeNumber();
        System.out.println(ob.isPrimeNumber(35));
    }
}
