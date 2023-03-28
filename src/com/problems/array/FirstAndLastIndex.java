package com.problems.array;

import java.util.Arrays;

public class FirstAndLastIndex {
    public int[] searchRange(int[] nums, int target){
        int[] arr = new int[2];
        arr[0] = arr[1] = -1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==target){
                arr[0] = i;
                while (i<nums.length && nums[i+1]==target){
                    i++;
                    arr[1] = i;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,8,10,12};
        int target = 8;
        FirstAndLastIndex idx = new FirstAndLastIndex();
        System.out.println(Arrays.toString(idx.searchRange(arr, target)));
    }
}
