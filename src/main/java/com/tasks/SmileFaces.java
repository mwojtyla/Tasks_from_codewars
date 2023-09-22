package com.tasks;

import java.util.*;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {

            String smile = arr.get(i);
            if (smile.length() == 3 && (String.valueOf(smile.charAt(0)).equals(":") || String.valueOf(smile.charAt(0)).equals(";")) && (String.valueOf(smile.charAt(1)).equals("-") || String.valueOf(smile.charAt(1)).equals("~")) && (String.valueOf(smile.charAt(2)).equals(")") || String.valueOf(smile.charAt(2)).equals("D"))) {
                counter++;
            } else if (smile.length() == 2 && (String.valueOf(smile.charAt(0)).equals(":") || String.valueOf(smile.charAt(0)).equals(";")) && (String.valueOf(smile.charAt(1)).equals(")") || String.valueOf(smile.charAt(1)).equals("D"))) {
                counter++;
            }
        }
        return counter;
    }
}
