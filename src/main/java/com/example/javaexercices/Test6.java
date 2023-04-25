package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(0,8,3,66,52,55,99));
        displayEvenIndex(integers);
    }

    private static void displayEvenIndex(List<Integer> integers) {

        for (int i = 0; i < integers.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(integers.get(i) + " ");
            }
        }

    }
}
