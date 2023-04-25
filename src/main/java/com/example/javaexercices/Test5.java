package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {

    public static ArrayList<String> reverse(ArrayList<String> s) {
        ArrayList<String> rev = new ArrayList<String>();

        s.forEach(e ->{
            rev.add(0,e);
        });
        return rev;
    }

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>(List.of("apple","hayder", "work"));
        System.out.println(stringArrayList);
        ArrayList<String> newarrayList = reverse(stringArrayList);
        System.out.println(newarrayList);
        Collections.reverse(stringArrayList);
        System.out.println(stringArrayList);
    }
}
