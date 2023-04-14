package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercice2 {

    public static void main(String[] args) {

        //print the missing number in our array list to the console
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(6,1,8,6,5,3,0,7));
       System.out.println(Missingnumber(arrayList));

    }

    public static HashSet<Integer> Missingnumber(ArrayList<Integer> arrayList) {
        //HashSet give us a sorted array list without duplication
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer num : arrayList) {
            hashSet.add(num);
        }

        for (int i = 0 ; i < arrayList.size(); i++) {
            if (!hashSet.contains(i)) {
//                hashSet.add(i);
                System.out.println(i);
            }
        }
        return hashSet;
    }
}
