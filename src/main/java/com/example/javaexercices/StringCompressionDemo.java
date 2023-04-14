package com.example.javaexercices;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressionDemo {

    public static void main(String[] args) {
        String str = "loojjuajabbaggg";

        // the difference between using HashMap and LinkedHashMap
        //HashMap will order the alphabet
        //LinkedHashMap will keep our order
        StringBuild(str);
    }

    public static void StringBuild(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0 ; i < str.length(); i++) {
            if(map.get(str.charAt(i)) != null) {
                //map.get(str.charAt(i)) : is an expression that retrieves the value associated with the key
                //If the key str.charAt(i) is present in the map, the expression returns the corresponding value
                // of type Integer. If the key is not present in the map, the expression returns null.
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else map.put(str.charAt(i), 1);
        }

        System.out.println(map);
        // output : {a=3, b=2, u=1, g=3, j=3, l=1, o=2}
    }
}
