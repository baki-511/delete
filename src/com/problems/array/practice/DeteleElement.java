package com.problems.array.practice;

public class DeteleElement {
    public static void deleteElement(int[] arr, int idx) {
        int n = arr.length-1;
        for (int i = idx; i < n; i++) {
            arr[i] = arr[i+1];
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 11, 8, 1, 23, 15, 38};
        deleteElement(arr,3);
    }
}
