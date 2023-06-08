package com.tasks;

public class NthSeries {

    public static String seriesSum(int n) {
        double sumOfSeries = 1.00;

        if (n == 0) {
            sumOfSeries = 0.00;
        } else if (n > 0) {
            for (int i = 1; i < n; i++) {
                sumOfSeries = sumOfSeries + 1.00 / ((double) i * 3 + 1);
            }
        }
        return String.format("%.2f", sumOfSeries);
    }
}
