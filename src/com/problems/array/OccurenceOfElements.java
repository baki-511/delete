package com.problems.array;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfElements {

    public void findOccurenceOfEachElement(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        map.forEach((k,v)-> System.out.println(k+" occures "+v +" times."));
    }

    public static void main(String[] args) {
        OccurenceOfElements elements = new OccurenceOfElements();
        int[] arr = {2,4,2,5,5,2,4,2,7,8,5};
        elements.findOccurenceOfEachElement(arr);
    }
}
