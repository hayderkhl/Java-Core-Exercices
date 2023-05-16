package com.example.javaexercices;

import java.util.ArrayList;

public class DeleteDuplicateChar {
    public static void main(String[] args) {
        String str = "aahyhhyyyyokejjjejjj";
        System.out.println("string bfore delete the duplicate char" + str);

        System.out.println(DeleteDupChar(str));
    }

    public static String DeleteDupChar(String str)
    {
        char[] chars = str.toCharArray();
        ArrayList<Character> myList = new ArrayList<Character>();
        for (char c : chars)
        {
            if (!myList.contains(c))
            {
                myList.add(c);
            }
        }

        StringBuilder str1 = new StringBuilder();
        for (char c : myList )
        {
            str1.append(c);
        }

        String sb = str1.toString();
        return sb;

    }
}
