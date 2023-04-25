package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Arrays;


public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> integerMap = new ArrayList(Arrays.asList(2,5,5,15));

        int num = 0;

        integerMap.forEach(number -> {
            System.out.println(number.compareTo(10));
            if (number.compareTo(10) > 0) {
                System.out.println(number);
            }
        });

        System.out.println(integerMap.size());

        for (int i = 0; i < integerMap.size(); i++) {
            num = num + integerMap.get(i);
            if (i == 3) {
                integerMap.add(i);
            }
        }
        System.out.println(integerMap.size());

    }
}
