package com.problems.array;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
            } else {
                int pastIndex = hm.get(nums[i]);
                if (Math.abs(pastIndex - i) <= k) {
                    return true;
                }
                else {
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int k = 3;
        ContainsDuplicate2 key = new ContainsDuplicate2();
        System.out.println(key.containsNearbyDuplicate(nums,k));
    }
}
