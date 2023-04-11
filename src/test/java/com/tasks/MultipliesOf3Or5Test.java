package com.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipliesOf3Or5Test {
    @Test
    public void test() {
        assertEquals(60, new MultipliesOf3Or5().solution(16));
    }

}
