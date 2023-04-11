package com.tasks;

public class MultipliesOf3Or5 {
    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (number < 0) {
                sum = 0;
            } else {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum = sum + i;
                }
            }

        }
        return sum;
    }
}
