package com.problems.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashmap {
    public static void main(String[] args) {

        Map<Integer,String> courseMap = new HashMap<>();
        courseMap.put(1,"C");
        courseMap.put(2,"C++");
        courseMap.put(3,"Python");
        courseMap.put(4,"Java");
        courseMap.put(5,"JavaScript");
        courseMap.put(6,"Go");
        courseMap.put(7,"PHP");

        //1. Iterate through  a Hashmap EntrySet using Iterator
        Iterator<Map.Entry<Integer, String>> iterator = courseMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+" ----> "+entry.getValue());
        }

        //2. Iterate through a hashmap KeySet using Iterator
        Iterator<Integer> iterator1 = courseMap.keySet().iterator();
        while (iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println(key+" ----> "+courseMap.get(key));
        }

        //3. Iterate Hashmap using forEach loop
        for(Map.Entry<Integer,String> entry:courseMap.entrySet()){
            System.out.println(entry.getKey()+" ====>> "+entry.getValue());
        }

        //4. Iterate through HashMap using Lambda Expression
        courseMap.forEach((k,v)-> System.out.println(k+" =====>> "+v));

        //5. Iterate through Hashmap using Stream ApI
        courseMap
                .entrySet()
                .stream()
                .forEach(a-> System.out.println(a));

    }
}
