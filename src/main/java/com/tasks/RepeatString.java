package com.tasks;

public class RepeatString {
        public static String repeatStr(final int repeat, final String string) {
            String word = "";

            for (int i = 0; i < repeat; i++){
                word = word + string;
            }
            return word;
        }
}
