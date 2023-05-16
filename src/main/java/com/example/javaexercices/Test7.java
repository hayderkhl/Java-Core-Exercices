package com.example.javaexercices;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>(List.of("JAva", "PHP", "C++"));
        List<String> myList1 = new ArrayList<String>(List.of("Spring", "Laravel", "Symphony"));

        System.out.println(myList);
        System.out.println(myList1);
        System.out.println("output");

        // instead we can use ( Collections.copy(myList1, myList);  )
       for (int i = 0; i < myList.size(); i++) {
           myList.set(i, myList1.get(i));
       }
        System.out.print(myList);

       // Collections.shuffle(languages);  we use this to shuffle the element inside an arrayList!

        // to extract a part of an ArrayList
//        List<Integer> sub_nbrs = nbrs.subList(4, 7);
//        System.out.println("La partie extrait: " + sub_nbrs);

        //we can use this :  nbrs.ensureCapacity(5); to increase the size of an arrayList
    }
}
