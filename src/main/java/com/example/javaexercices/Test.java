package com.example.javaexercices;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String myString = "ppplllrlll";
        Map<Character, Integer> map = new LinkedHashMap<>();

       countAlphabet(myString);
    }

    private static void countAlphabet(String myString) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < myString.length() ; i++) {
            if(map.get(myString.charAt(i)) != null) {
                map.put(myString.charAt(i) , map.get(myString.charAt(i))+1);
            } else map.put(myString.charAt(i), 1);
        }
        System.out.println(map);
    }
}
