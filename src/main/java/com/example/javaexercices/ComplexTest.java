package com.example.javaexercices;

import java.util.Scanner;

public class ComplexTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();

        Complex complex = new Complex(a, b);

        complex.complexNumber();
        scanner.close();
    }
}
