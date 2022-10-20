package com.in28minutes.junit.helper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysCompareTest {

    // Array.sort

    @Test
    void testArraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 18};
        int[] expected = {3, 4, 12, 18};
        Arrays.sort(numbers);

        //fails bc it checks if they are the same object
//        assertEquals(expected, numbers);

        // to compare the values in arrays use assertArrayEquals
        assertArrayEquals(expected, numbers);
    }

}