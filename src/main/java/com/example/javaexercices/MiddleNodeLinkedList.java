package com.example.javaexercices;

import java.util.LinkedList;

public class MiddleNodeLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(39);
        list.add(45);
        list.add(5);
        list.add(5);

        int middel = list.size()/2;
        System.out.println(list.get(0));
        //int middle = getMiddle(list);

        //System.out.println("The middle element of the LinkedList is " + middle);
    }

//    public static int getMiddle(LinkedList<Integer> list) {
//        int size = list.size();
//        int middle = size / 2;
//
//        // If the size of the LinkedList is even, return the second middle element
//        if (size % 2 == 0) {
//            return list.get(middle);
//        }
//
//        // If the size of the LinkedList is odd, return the middle element
//        return list.get(middle);
//    }
}