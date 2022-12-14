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
        //assertEquals(expected, numbers);

        // to compare the values in arrays use assertArrayEquals
        assertArrayEquals(expected, numbers);


    }

    @Test(expected=NullPointerException.class)   // does not work in JUnit5
     void testArraySort_NullArray() {
        int[] numbers = {};
//        int[] numbers = null;
//        Arrays.sort(numbers);
        int[] expected = {3, 4, 12, 18};
        try {
            Arrays.sort(numbers);
        } catch (NullPointerException e) {

        }


        // test exceptions by changing the numbers array to null
        // use try-catch block and test will succeed bc NullPointer Exception is expected
        // better way - is to user @Test(expected = NullPointerException.class)  does not work in java 18
        // empty array {} will not throw an expection, thus failed
    }

    @Test(timeout = 1000)   //does not work in JUnit 5
    public void testSort_Performance() {
        int array[] = {12, 23, 4};
        for(int i=1; i <= 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}

/*

JUnit 5 does no use expected and timeout https://www.arhohuttunen.com/junit-5-migration/#assertions
* */