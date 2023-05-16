package com.example.javaexercices;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Integer note1 = scanner.nextInt();
        Integer note2 = scanner.nextInt();


        Student student = new Student(name, note1, note2);
        student.grade();
        scanner.close();
    }
}
