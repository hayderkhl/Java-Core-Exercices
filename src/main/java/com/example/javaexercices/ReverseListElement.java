package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class ReverseListElement {

    public static ArrayList reverseElement(ArrayList<String> list) {

        ArrayList<String> inverseList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            inverseList.add(0, list.get(i));
        }

        // or use instead Collections.reverse(list);
        return inverseList;
    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(List.of("hello", "my", "world"));
       System.out.print(reverseElement(myList));
    }
}
