package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>(List.of("php", "java", "c++"));
        ArrayList<String> list2 = new ArrayList<String>(List.of("c", "php", "java"));


       List<String> strings = new ArrayList<String>();

       for (int i = 0 ; i <list1.size(); i++) {

           if (list1.contains(list2.get(i))) {
               strings.add("true");
           } else strings.add("false");

       }
       System.out.print(strings);
    }
}
