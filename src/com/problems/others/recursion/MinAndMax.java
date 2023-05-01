package com.problems.others.recursion;

public class MinAndMax {

    public static int maxNum(int[] arr, int start, int max) {
        if (start == arr.length) {
            return max;
        }
        if (max < arr[start]) {
            max = arr[start];
        }
        return maxNum(arr, start + 1, max);
    }

    public static int minNum(int[] arr, int start, int min) {
        if (start == arr.length) {
            return min;
        }
        if (min > arr[start]) {
            min = arr[start];
        }
        return minNum(arr, start + 1, min);
    }

    public static int[] minAndMax(int arr[], int start, int min, int max, int[] res) {
        if (start == arr.length) {
            return res;
        }
        if (max < arr[start]) {
            max = res[0] = arr[start];
        }
        if (min > arr[start]) {
            min = res[1] = arr[start];
        }
        return minAndMax(arr, start + 1, min, max, res);
    }

    public static void main(String[] args) {
        int nums[] = {33, 44, 77, 88, 67, 23, 11,57};
        int max = nums[0];
        int min = nums[0];
        int ans[] = new int[2];
        System.out.println("Max nums = " + maxNum(nums, 0, max));
        System.out.println("Min number = " + minNum(nums, 0, min));
        ans = minAndMax(nums, 0, min, max, ans);
        System.out.println("Max Number = "+ans[0]+"   Min Number = "+ans[1]);
    }
}
