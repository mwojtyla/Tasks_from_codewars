package com.tasks;

public class CamelCase {
    static String toCamelCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ("-".equals(String.valueOf(s.charAt(i))) || "_".equals(String.valueOf(s.charAt(i)))) {
                s = s.substring(0, i) + String.valueOf(s.charAt(i + 1)).toUpperCase() + s.substring(i + 2);
            }
        }
        return s;
    }
}
