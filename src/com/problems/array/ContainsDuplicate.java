package com.problems.array;

import java.util.Collections;
import java.util.HashMap;

public class ContainsDuplicate {
    public boolean isArrayContainsDuplicate(int [] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i:arr){
            if (hm.containsKey(i)) {
                return true;
            }
            else {
                hm.put(i,1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate ob = new ContainsDuplicate();
        int[] arr = {1, 2, 3, 4, 3 };
        System.out.println("Is array contains Duplicate element = "+ob.isArrayContainsDuplicate(arr));
    }
}
