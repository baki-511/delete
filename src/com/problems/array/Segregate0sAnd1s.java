package com.problems.array;

import java.util.LinkedList;
import java.util.List;

public class Segregate0sAnd1s {
    public List<Integer> segregate0sAnd1s(int[] arr){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ll.addFirst(arr[i]);

            }
            else {
                ll.addLast(arr[i]);
            }
        }
        return ll;
    }

    public static void main(String[] args) {
        Segregate0sAnd1s ob = new Segregate0sAnd1s();
        int[] arr= {1,1,0,0,1,0,1,1,0};
        List<Integer> list = ob.segregate0sAnd1s(arr);
        list
                .forEach(a-> System.out.print(a+", "));
    }
}
