package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(2,5,6,8,10));
        ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(5,16,74,11,0,8));
        intersection(integers1, integers2);
        }

        private static void intersection(ArrayList<Integer> int1 , ArrayList<Integer> int2) {

            for (int i = 0; i < int1.size(); i++) {

                if (int2.contains(int1.get(i))) {
                    System.out.println("the intersection is : " + int1.get(i));
                }

            }
        }
    }
