package com.problems.array;

public class RemoveElements {

    public int removeElement(int[] nums, int val){
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElements remove = new RemoveElements();
        int arr[] = {3,2,2,3,4,8,9,3};
        System.out.println("After removing elements remains = "+remove.removeElement(arr,3));
    }
}
