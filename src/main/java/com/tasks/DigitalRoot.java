package com.tasks;

public class DigitalRoot {
    public static int digital_root(int n) {
        String numbers = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < numbers.length(); i++) {
            sum = sum + Character.getNumericValue(numbers.charAt(i));
        }
        return String.valueOf(sum).length() == 1 ? sum : digital_root(sum);

    }
}
