package com.problems.array;

public class MaxAndMinNumber {
    public void findSmallestAndLargestNums(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Largest element = "+max+"\nSmallest Element = "+min);
    }

    public static void main(String[] args) {
        MaxAndMinNumber ob = new MaxAndMinNumber();
        int arr[] = {3,2,2,3,4,8,9,3};
        ob.findSmallestAndLargestNums(arr);
    }
}
