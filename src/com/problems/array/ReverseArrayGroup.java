package com.problems.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseArrayGroup {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i = 0;
        int j = k - 1;
        while (i < j) {
            int temp = arr.get(i);


        }

    }

    public int firstElementKTime(int[] a, int n, int k) {
        int[] temp = new int[10000];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            temp[a[i]]++;
            if (temp[a[i]] == k) {
                return a[i];
            }
        }
        return -1;
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                list.add(0,arr[i]);
                max = arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int A[] = {1,2,3,4,0};
//        System.out.println(new ReverseArrayGroup().firstElementKTime(A, 7, 2));
        System.out.println(leaders(A,6));

    }
}
