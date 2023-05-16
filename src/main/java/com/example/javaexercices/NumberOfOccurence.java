package com.example.javaexercices;

public class NumberOfOccurence {

    public static void main(String[] args) {

        String str = "AAABAB";
        char[] chars = str.toCharArray();

        int t = 0;
        int d = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'A')
            {
                t++;
            } else d++;

        }
        if (d > t)
        {
            Integer r = d - t;
            System.out.println("the result is : " + r);
        } else if (t > d)
        {
            Integer r = t - d;
            System.out.println("the result is : " + r);
        }
    }

}
