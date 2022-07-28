package com.chijioke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata2Test {
    Kata seq = new Kata();
    @Test
    public void checkMinimumValue () {
        Integer[] task = {1,2,3,4,5};

        Integer minVal = seq.calculateMin(task);
        assertEquals(1, minVal);

        assertEquals(1, minVal);
    }

    @Test
    public void checkMaximumValue () {
        Integer[] task = {1,2,3,4,5};
        Integer maxVal = seq.calculateMax(task);
        assertEquals(5, maxVal);
    }





}