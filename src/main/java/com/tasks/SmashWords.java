package com.tasks;

import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence = sentence + words[i];
            if (i < words.length - 1) {
                sentence = sentence + " ";
            }
        }
        return sentence;
    }
}