package com.example.javaexercices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        System.out.println("write a string : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // first split string into caracters, so we can itirate each word

        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        //add all words into map
        //if a word already exist then increment the value by 1
        //or just put one in its value

        for (String str1 : words) {
            if (map.get(str1) != null) {
                map.put(str1, map.get(str1) + 1);
            } else {
                map.put(str1, 1);
            }
        }

        //Map<key, value> ,we create the set to iterate according to the key

        Set<String> str2 = map.keySet();
        for (String str3 : str2) {
           if (map.get(str3) > 1) {
               System.out.println("words " + str3 + ": repeated " + map.get(str3) + "time");
           }
        }
    }
}
