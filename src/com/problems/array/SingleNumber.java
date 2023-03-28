package com.problems.array;


/*
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Input: nums = [2,2,1]
        Output: 1
        */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int value = 0;
        for (int i : nums) {
            value = value ^ i;
        }
        return value;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int arr[] = {4, 1, 2, 1, 2};
        System.out.println("Unique element in the array = " + singleNumber.singleNumber(arr));

    }
}
