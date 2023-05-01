package com.problems.others.recursion;

public class SearchItem {
    public static int searchItem(int[] arr, int item, int start) {
        if (start == arr.length) {
            return -1;
        }
        if (arr[start] == item) {
            return start;
        }
        return searchItem(arr, item, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 11, 5, 2, 23};
        System.out.println(searchItem(arr,5,0));
    }
}
