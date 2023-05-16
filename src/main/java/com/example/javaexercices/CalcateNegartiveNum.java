package com.example.javaexercices;

import java.util.ArrayList;

public class CalcateNegartiveNum {
    public static int addNegValues(ArrayList<Integer> list)
    {
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(0);
        list.forEach(num -> {
            if (num < 0) {
                sum.set(0, sum.get(0) + num);
            }
        });
        return sum.get(0);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        liste.add(1);
        liste.add(-2);
        liste.add(3);
        liste.add(-4);
        liste.add(-5);
        liste.add(6);
        liste.add(7);

        System.out.println(addNegValues(liste));
    }

    //Other Methode
//    public static int addNegValues(ArrayList<Integer> list) {
//        int[] sum = {0};
//        list.forEach(num -> {
//            if (num < 0) {
//                sum[0] += num;
//            }
//        });
//        return sum[0];
//    }
    // Third Methode
//    public static int addNegValues(ArrayList<Integer> list) {
//        int sum = 0;
//        for (Integer num : list) {
//            if (num < 0) {
//                sum += num;
//            }
//        }
//        return sum;
//    }
}
