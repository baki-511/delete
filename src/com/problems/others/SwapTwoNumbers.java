package com.problems.others;

public class SwapTwoNumbers {
    public void swapUsingThirdVariable(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nSwapping using third variable --->");
        System.out.println("swapping a = "+a+" and b = "+b);
    }
    public void swpWithoutThirdVariable1(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nSwapping without using third variable method 1 ----> ");
        System.out.println("swapping a = "+a+" and b = "+b);
    }

    public void swpWithoutThirdVariable2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nSwapping without using third variable method 2 ----> ");
        System.out.println("swapping a = "+a+" and b = "+b);
    }
    public static void main(String[] args) {
        SwapTwoNumbers ob = new SwapTwoNumbers();
        int a = 10, b = 20;
        System.out.println("\nBefore swapping a = "+a+" and b = "+b);
        ob.swpWithoutThirdVariable2(a,b);
    }
}
