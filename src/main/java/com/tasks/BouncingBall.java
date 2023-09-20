package com.tasks;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {

        if (h > 0 && window < h && bounce > 0 && bounce < 1) {
            int sum = 1;
            while (h * bounce > window) {
                sum = sum + 2;
                h = h - (h - h * bounce);
            }
            return sum;
        } else {
            return -1;
        }
    }
}
