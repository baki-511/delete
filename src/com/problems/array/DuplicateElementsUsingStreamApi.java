package com.problems.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsUsingStreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,4,6,5);
        Set<Integer> s = new HashSet<Integer>();

        List<Integer> collect = list.stream().filter(a -> !s.add(a)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
