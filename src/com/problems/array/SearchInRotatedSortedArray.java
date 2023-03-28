package com.problems.array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid  = (start+end)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else if(nums[mid]<=nums[end]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray ob = new SearchInRotatedSortedArray();
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Index of element = "+ob.search(arr,target));
    }
}
