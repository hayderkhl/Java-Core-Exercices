package com.example.javaexercices;

import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {

        String s = "haidar";

         char[] chars = s.toCharArray();

         char temps = chars[0];
         chars[0] = chars[s.length() - 1];
         chars[s.length()-1] = temps;

         String s1 =  new String(chars);
         System.out.println(s1);
    }

    public static String swapFirstAndLast(String s) {
        if (s == null || s.length() < 2) {
            return s; // Return the original string if it's null or has length less than 2
        }

        StringBuilder sb = new StringBuilder(s);
        char first = sb.charAt(0);
        char last = sb.charAt(s.length() - 1);

        sb.setCharAt(0, last);
        sb.setCharAt(s.length() - 1, first);

        return sb.toString();
    }
}
