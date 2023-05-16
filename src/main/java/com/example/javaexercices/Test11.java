package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class Test11 {

    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>(List.of("A","B","C"));
        ArrayList<String> mylist1 = new ArrayList<>(List.of("D","E","F"));

        for (int i = 0 ; i < mylist1.size(); i++) {

            mylist.add(i,mylist1.get(i));
        }
        System.out.print(mylist);
    }

    //or i create a third list and i use addAll()
    // we can use  liste.removeAll(liste); to remove all the element from a list

}
