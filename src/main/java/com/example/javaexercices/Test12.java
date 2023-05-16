package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class Test12 {

        public static void main(String[] args)
        {
            ArrayList<String> liste = new ArrayList<String>();
            liste.add("Bob");
            liste.add("Ali");
            liste.add("Aliooooooooo");
            liste.add("Mélissandre");
            liste.add("Alex");
            liste.add("Alexopopopopoopppoopopopopopop");
            liste.add("Thomas");
            liste.add("Thomaspppppppppppp");

            System.out.println(findLongStr(liste));
        }
    public static String findLongStr(ArrayList<String> liste)
    {
        int i = 0;
        while ( i <liste.size() -1) {
            if (liste.get(i).length() < liste.get(i+1).length()) {
                String temp = liste.get(i);
                liste.set(i, liste.get(i+1));
                liste.set(i+1, temp);
                i++;
            }
        }

        return liste.get(liste.size()-1);
//        return liste.get(0);
    }

}
