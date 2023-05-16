package com.example.javaexercices;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int num : numbers) {
            if(numbers.contains(5) ) {
                System.out.println("yes it contains 5 " + 5);
            }
        }

        System.out.println(numbers);
    }
}
