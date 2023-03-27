package com.problems.array;

public class SumOfArray {
    public int sumOfArrayElements(int[] arr){
        int n=arr.length;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfArray sumOfArray = new SumOfArray();
        int arr[] = { 5, 1, 4, 2, 8,10,23 };
        System.out.println("Sum of Array = "+sumOfArray.sumOfArrayElements(arr));
    }
}
