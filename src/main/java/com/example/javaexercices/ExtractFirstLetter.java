package com.example.javaexercices;

import java.util.Arrays;

public class ExtractFirstLetter {

    public static void main(String[] args) {
        String string = "hello from the other side";
        extractLetter(string);

    }

    private static void extractLetter(String string) {

        String words[] = string.split(" ");
        // write an array to consome in java
        System.out.println(Arrays.toString(words));
        for (int i = 0 ; i < words.length; i++) {
            String s = words[i];
            System.out.println(s.charAt(0));
        }
    }

    // output : [hello, from, the, other, side]
    //h
    //f
    //t
    //o
    //s
}
