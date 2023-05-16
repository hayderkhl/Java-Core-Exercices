package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriList {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("play", "dance", "read", "work", "add"));

        Collections.sort(myList);
        System.out.print(myList);
    }
}
