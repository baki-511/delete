package com.problems.string;

public class FirstOccurenceIndex {
    public int findFirstOccurenceIndex(String str, String sub){
        int strLen = str.length();
        int subLen = sub.length();
        for (int i=0; i<strLen-subLen+1; i++){
            if (str.charAt(i)==sub.charAt(0)){
                if (str.substring(i,subLen+i).equals(sub)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccurenceIndex firstIndex = new FirstOccurenceIndex();
        System.out.println("First indes = "+firstIndex.findFirstOccurenceIndex("sadbutsad","butd"));
    }
}
