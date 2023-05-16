package com.example.javaexercices;

public class InverseString {

    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.charAt(0));
        System.out.println(inverseString(str));
    }

    private static String inverseString(String str) {

        if (str.length() == 0)
            return str;

        return inverseString(str.substring(1)) + str.charAt(0);
    }

}
