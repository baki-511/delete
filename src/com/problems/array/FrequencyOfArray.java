package com.problems.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {
    public void frequencyOfElement(int[] arr, int[] freq) {
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
                if (freq[i] != visited) {
                    freq[i] = count;
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + " ---> " + freq[i]);
            }
        }
    }

    public void findFreqUsingHashMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        map.forEach((k,v)-> System.out.println(k +" -------> "+v));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 3, 1};
        int[] freq = new int[arr.length];
        int visited = -1;

        FrequencyOfArray f = new FrequencyOfArray();
//        f.frequencyOfElement(arr,freq);

        //Using Hashmap
        f.findFreqUsingHashMap(arr);
    }
}
