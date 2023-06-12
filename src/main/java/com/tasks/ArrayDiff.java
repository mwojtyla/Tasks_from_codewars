package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> numbers = new ArrayList<>();

        for (int y = 0; y < a.length; y++) {
            numbers.add(a[y]);
        }

        if (a.length > 0 && b.length > 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        numbers.remove(Integer.valueOf(a[i]));
                    }
                }
            }
            a = new int[numbers.size()];
            for (int x = 0; x < numbers.size(); x++) {
                a[x] = numbers.get(x);
            }
        }
        return a;
    }
}


