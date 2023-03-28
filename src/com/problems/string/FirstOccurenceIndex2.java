package com.problems.string;

public class FirstOccurenceIndex2 {
    public int findFirstOccurenceIndex(String str, String sub){
        return str.indexOf(sub);
    }

    public static void main(String[] args) {
        FirstOccurenceIndex2 id = new FirstOccurenceIndex2();
        String str = "sadbutsad";
        String sub = "but";
        System.out.println("First Index of string = "+id.findFirstOccurenceIndex(str,sub));
    }
}
