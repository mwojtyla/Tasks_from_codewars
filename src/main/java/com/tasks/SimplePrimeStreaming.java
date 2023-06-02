package com.tasks;

public class SimplePrimeStreaming {
    private static boolean checkPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String solve(int a, int b) {
        String primeNumbers = "2";

        for (int i = 3; i <= 100000; i += 2) {
            if (checkPrime(i)) {
                primeNumbers += i;
            }
        }

        String result = "";
        for (int i = a; i < a + b; i++) {
            result += Character.toString(primeNumbers.charAt(i));
        }
        return result;
    }
}