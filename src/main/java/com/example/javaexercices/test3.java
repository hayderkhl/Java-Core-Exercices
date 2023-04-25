package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class test3 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("hayder@gmail.com");
        stringList.add("souha@gmail.com");
        stringList.add("hayder@yahoo.com");
        stringList.add("hayder@hotmail.com");

        stringList.forEach(s -> {
            if (s.contains("yahoo.com")) {
                System.out.println(s);
            }
        });

    }
}
