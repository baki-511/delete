package com.problems.array;

public class MoveZeroAtEnd {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
        for (int j : nums) {
            System.out.print(j+", ");
        }
    }

    public static void main(String[] args) {
        MoveZeroAtEnd ob = new MoveZeroAtEnd();
        int[] arr = {0,1,0,3,12};
        ob.moveZeroes(arr);
    }
}
