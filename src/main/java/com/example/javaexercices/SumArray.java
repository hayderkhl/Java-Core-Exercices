package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class SumArray {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(3);

        int sum1 = arrayList.stream().mapToInt(Integer::intValue).sum();
        double avr =(double) sum1/arrayList.size();
        //here we add String.format to write only two numbers after the coma
        String formattedNumber = String.format("%.2f", avr);
        System.out.println(sum1);
        System.out.println(formattedNumber);

        //this line to remove the dublicated numbers in the array list
        List<Integer> distinctNumbers = arrayList.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctNumbers);
        // we try to add even numbers from 20 to 50 to our new array list
        for (int i = 20 ; i <= 50 ; i++) {
            if (i % 2 == 0 ) {
                distinctNumbers.add(i);
            }
        }
        System.out.println("new array list :");
        System.out.println(distinctNumbers);
        // in my array list I want to multiply the numbers by 2

        ArrayList<Integer> newarrayList = new ArrayList<>();
        distinctNumbers.forEach( number ->{
            int multipliedNumber = number * 2;
            newarrayList.add(multipliedNumber);

        });

        System.out.println("ArrayList after multiplication :");
        System.out.println(newarrayList);

        // I want to multiply by 3 the integers in my list arrayList which have a even index

        for (int j =0 ; j < newarrayList.size(); j++) {
            if (j % 2 ==0) {
               int newValues = newarrayList.get(j) * 3 ;
               newarrayList.set(j, newValues);
            }
        }
        System.out.println("write the ArrayList after mutiply the even index by 3 :");
        System.out.println(newarrayList);
        System.out.println("sorted array");
        Collections.sort(newarrayList);
        System.out.println(newarrayList);
        int lastNumber = newarrayList.get(newarrayList.size() - 1);
        System.out.println("this is the biggest number in the newArrayList");
        System.out.println(lastNumber);
        Collections.sort(newarrayList, Collections.reverseOrder());
        System.out.println("inverse sort array list");
        System.out.println(newarrayList);
    }
}
