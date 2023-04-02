package com.problems.string;

public class RemoveWhiteSpaces {
    public String removeWhiteSpace(String str) {
        String replace = str.replace(" ", "");
        return replace;
    }

    public String removeWhteSpace2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveWhiteSpaces rm = new RemoveWhiteSpaces();
        String str = "Hello Java World";
        System.out.println("Using First solution = " + rm.removeWhiteSpace(str));
        System.out.println("Using Second solution = " + rm.removeWhteSpace2(str));
    }

}
