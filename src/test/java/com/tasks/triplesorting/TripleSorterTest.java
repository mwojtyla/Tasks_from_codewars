package com.tasks.triplesorting;

import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TripleSorterTest {

    @Test
    public void basicTest() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));
        students.add(new Student(25, 82, "Mark Rose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 90, "Jane Dane"));
        assertEquals("Jane Doe,Jane Dane,David Goodman,Mark Rose",
                TripleSorter.sort(students));
    }
}
