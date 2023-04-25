package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class Test9 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(List.of("php", "java", "c++", "ruby", "c#"));

        String temp = list1.get(0);
        list1.set(0, list1.get(2));
        list1.set(2, temp);
        System.out.print(list1);
    }
    // we can use java collections : Collections.swap(list1, 0, 2);

}
