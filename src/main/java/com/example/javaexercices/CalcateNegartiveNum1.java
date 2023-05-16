package com.example.javaexercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class CalcateNegartiveNum1 {


    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(List.of(2,88,6,3,4,1));
        Integer target = 9;

        Collections.sort(myList);

        int[] result = new int[2];
        for (int i = 0; i < myList.size();i++) {
            for (int j = i+1; j < myList.size(); j++) {
                if (myList.get(i) + myList.get(j) == target) {
                    result[0] = i;
                    result[1] = j;
                    Integer test = myList.get(2) + myList.get(4);
                    System.out.println("index one is : " + i + "   index tow is : " + j + " and the target is : " + target);
                }

            }
        }
    }

}
