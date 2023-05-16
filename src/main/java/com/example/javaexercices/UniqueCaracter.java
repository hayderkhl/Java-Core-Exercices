package com.example.javaexercices;


import java.util.ArrayList;

public class UniqueCaracter {

    public static void main(String[] args) {
        String str = "azertyuiop";
        System.out.println(uniqueOrNot(str));
    }

    private static boolean uniqueOrNot(String str) {

        char[] chars = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (char c : chars)
        {
            list.add(c);
        }

        int p =0;
        for (int i = 0; i < list.size(); i++)
        {
            for (char c : chars)
            {
                if (list.get(i) == c)
                {
                    p = p + 1;
                    if (p > 1)
                    {
                        return false;
                    }
                } else p =0;
            }
        }
        return true;
    }
}
