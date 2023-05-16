package com.example.javaexercices;

import java.util.ArrayList;

public class Test10 {

    public class Main {
        public static void deleteLongStrings(ArrayList<String> list) {
            list.removeIf(s -> s.length() > 4);
        }

        public static void main(String[] args) {
            ArrayList<String> liste = new ArrayList<String>();
            liste.add("Bob");
            liste.add("Ali");
            liste.add("Thomas");
            liste.add("Alex");
            liste.add("Nermine");


            deleteLongStrings(liste);

            System.out.println(liste);
        }
    }

    //other method
//    public static void deleteLongStrings(ArrayList<String> liste)
//    {
//        int i = 0;
//        while(i < liste.size())
//        {
//            if (liste.get(i).length() > 4)
//            {
//                liste.remove(i);
//            }
//            i++;
//        }
//    }
}
