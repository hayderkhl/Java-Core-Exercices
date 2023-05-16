package com.example.javaexercices;

public class PointTest {

        public static void main(String[] args) {
            Point p1 = new Point(0, 0);
            Point p2 = new Point(3, 4);

            double distance = p1.distance(p2);

            System.out.println("The distance between p1 and p2 is: " + distance);
        }
    }

