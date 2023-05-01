package com.problems.others.recursion;

public class SeachIndexElement {
    public static int searchIdx(int[] arr, int idx, int start) {
        if (idx < 0 || idx > arr.length - 1 || start == arr.length) {
            return -1;
        }
        if (idx == start) {
            return arr[start];
        }
        return searchIdx(arr, idx, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 11, 5, 2, 23};
        System.out.println(searchIdx(arr,3,0));
    }
}
