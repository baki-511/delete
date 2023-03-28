package com.problems.array;

import java.util.HashMap;
import java.util.stream.Collectors;

public class DuplicateElement2 {
    public static void printDuplicates(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        map
                .entrySet().stream()
                .filter(m->m.getValue()>1)
                .forEach(a -> System.out.println(a.getKey()));

    }

    public static void main(String[] args) {
        int[] arr = {2,4,2,5,4,7,8,4,5};
        printDuplicates(arr);
    }
}
