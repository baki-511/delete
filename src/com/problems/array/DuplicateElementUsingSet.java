package com.problems.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementUsingSet {
    public void printDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if (!set.add(i)){
                System.out.print(i+", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,2,5,4,7,8,5};
        DuplicateElementUsingSet duplicate = new DuplicateElementUsingSet();
        duplicate.printDuplicates(arr);
    }
}
