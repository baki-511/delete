package com.problems.array.practice;

public class InsertArray {
    public static void insertElement(int[] arr, int val, int idx) {
        int n = arr.length;
        int[] temp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        int len = temp.length - 1;
        for (int i =  len; i > idx; i--) {
            temp[len] = temp[len - 1];
        }
        temp[idx] = val;
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+", ");
        }

//        for (int i = idx; i < arr.length; i++) {
//
//        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 11, 8, 1, 23, 15, 38};
        insertElement(arr,50,3);
    }
}
