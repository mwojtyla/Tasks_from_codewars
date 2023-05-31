package com.tasks.triplesorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TripleSorter {

    public static String sort(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingInt(Student::getGpa)
                .reversed()
                .thenComparing(s -> s.getFullName().split(" ")[1].charAt(0))
                .thenComparingInt(Student::getAge))
                .map(Student::getFullName)
                .collect(Collectors.joining(","));
    }
}
