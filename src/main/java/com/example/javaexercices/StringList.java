package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringList {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("ooooooli");
        strings.add("sli");
        strings.add("sl");
        strings.add("banana");
        strings.add("apple");

        strings.add("haydr");
        strings.add("fruit");

        // here we compare by string's lenghts
//            Collections.sort(strings, new Comparator<String>() {
//                public int compare(String s1, String s2) {
//                    return Integer.compare(s1.length(), s2.length());
//                }
//            });

       // descending order
                Collections.sort(strings, (s1, s2) -> s2.length() - s1.length());
                String temp;

//        the compareTo method does not compare the length of the strings. It compares the strings based on their l
//        exicographic order, which means it compares the Unicode values of each character in the strings.
        //        for (int i = 0; i < strings.size(); i++) {
        //            for (int j = i + 1; j < strings.size(); j++) {
        //
        //                if (strings.get(i).compareTo(strings.get(j)) > 0) {
        //                    temp = strings.get(i);
        //                    strings.set(i, strings.get(j));
        //                    strings.set(j, temp);
        //                }
        //            }
        //        }
        //        Collections.sort(strings); // this will be ascended order
                System.out.println(strings);
//        Collections.sort(strings, Collections.reverseOrder());
//        System.out.println(strings);
    }

//    public class Example {
//        public static void main(String[] args) {
//            ArrayList<String> fruits = new ArrayList<String>();
//
//            fruits.add("Apple");
//            fruits.add("Banana");
//            fruits.add("Orange");
//
//            System.out.println("Fruits: " + fruits);
//            System.out.println("Size: " + fruits.size());
//
//            fruits.addAll(java.util.Arrays.asList("Grape", "Pineapple"));
//
//            System.out.println("Fruits after adding new elements: " + fruits);
//
//            int index = fruits.indexOf("Banana");
//            System.out.println("Index of 'Banana': " + index);
//
//            boolean containsGrape = fruits.contains("Grape");
//            System.out.println("Contains 'Grape': " + containsGrape);
//
//            fruits.set(2, "Mango");
//            System.out.println("Fruits after replacing 'Orange' with 'Mango': " + fruits);
//
//            fruits.remove(0);
//            System.out.println("Fruits after removing first element: " + fruits);
//
//            fruits.clear();
//            System.out.println("Fruits after clearing the ArrayList: " + fruits);
//            System.out.println("Is ArrayList empty? " + fruits.isEmpty());
//        }
//    }
}