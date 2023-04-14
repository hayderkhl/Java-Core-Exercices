package com.example.javaexercices;

public class PanagramString {

    public static void main(String[] args) {

//Panagram mean the string contain all the alphabet !

        String string = "azertyuiopqsdfghjklmwxcv";

        System.out.println(isPanagram(string.toLowerCase()));
    }
    private static boolean isPanagram(String string) {

        if (string.length() < 26) {
            return false;
        } else {
            for (char ch='a'; ch < 'z'; ch++) {
                if (string.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
//    The indexOf() method is called on the string object to determine the index position of the first
//    occurrence of the character ch within the string. If ch is not found within the string, indexOf() returns -1.

}
