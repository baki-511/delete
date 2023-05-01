package com.problems.others.recursion;

public class ReverseArray {
    public void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {23, 4, 1, 5, 2, 7};
        ReverseArray reverseArray = new ReverseArray();
        System.out.println("Before Reversed");
        reverseArray.printArr(arr);
        reverseArray.reverseArray(arr,0,arr.length-1);
        System.out.println("After Reversed");
        reverseArray.printArr(arr);
    }
}
