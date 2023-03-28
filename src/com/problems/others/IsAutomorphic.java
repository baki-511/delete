package com.problems.others;

public class IsAutomorphic {
    public boolean isAutomorphic(int n){
        int sq = n*n;
        while (n>0){
            if(n%10 != sq%10){
                return false;
            }else {
                n /= 10;
                sq /= 10;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsAutomorphic is = new IsAutomorphic();
        System.out.println("Is numbeer is Automorphic = "+is.isAutomorphic(25));
    }
}
