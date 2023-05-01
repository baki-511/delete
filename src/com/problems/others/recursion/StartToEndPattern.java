package com.problems.others.recursion;

import java.util.ArrayList;
import java.util.List;

public class StartToEndPattern {
    public void helper(List<Integer> list, int present) {
        if (present <= 0) {
            list.add(present);
            return;
        }
        list.add(present);
        helper(list, present - 5);
        list.add(present);
    }
    public List<Integer> pattern(int n){
        List<Integer> res = new ArrayList<>();
        helper(res,n);
        return res;
    }

    public static void main(String[] args) {
        StartToEndPattern s = new StartToEndPattern();
        System.out.println(s.pattern(17));
    }
}
