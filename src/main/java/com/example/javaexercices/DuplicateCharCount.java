package com.example.javaexercices;

import com.sun.source.doctree.SeeTree;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount {

    public static void main(String[] args) {

        String str =  "lllikakkakakndhnhhnxw";
        duplicatCharValue(str);

    }

    static void duplicatCharValue(String str)
    {
        char[] chars = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : chars)
        {
            if(charMap.containsKey(c))
            {
                charMap.put(c, charMap.get(c) + 1);
            } else
                charMap.put(c, 1);
        }

        Set<Character> mySet = charMap.keySet();
        for (char c : mySet)
        {
            if (charMap.get(c) > 1)
            {
                System.out.println(c + " : " + charMap.get(c));
            }
        }
    }















//    import java.util.HashMap;
//import java.util.Map;
//
//    public class HashMapExample {
//        public static void main(String[] args) {
//            // Creating a HashMap
//            Map<String, Integer> hashMap = new HashMap<>();
//
//            // Adding key-value pairs
//            hashMap.put("Apple", 10);
//            hashMap.put("Banana", 5);
//            hashMap.put("Orange", 15);
//
//            // Accessing values
//            int appleQuantity = hashMap.get("Apple");
//            System.out.println("Quantity of Apple: " + appleQuantity);
//
//            // Checking if a key exists
//            boolean containsKey = hashMap.containsKey("Banana");
//            System.out.println("Contains Banana? " + containsKey);
//
//            // Removing a key-value pair
//            hashMap.remove("Orange");
//
//            // Iterating over key-value pairs
//            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//                String key = entry.getKey();
//                int value = entry.getValue();
//                System.out.println("Fruit: " + key + ", Quantity: " + value);
//            }
//        }
//    }
}
