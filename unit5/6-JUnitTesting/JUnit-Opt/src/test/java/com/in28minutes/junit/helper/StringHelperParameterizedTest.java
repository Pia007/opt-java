package com.in28minutes.junit.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    StringHelper helper;

    @BeforeEach
    void before() {
        // create a new instance of StringHelper so that each test will have a new instance
        helper = new StringHelper();
//        System.out.println("helper created");

    }

    @Test
    void truncateAInFirst2Positions_AinFirst2Positions() {

        // refactored
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        // should not test 2 conditions in the same unit test
        // assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    // testing the second condition in a separate test
    @Test
    void truncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    void truncateAInFirst2Positions_AisNotPresent() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    void truncateAInFirst2Positions_AnotInFirstPosition() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    /* areFirstAndLastTwoCharactersTheSame ABCD => false, ABAB => true, AB => true, A => false*/
    @Test
    void areFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        //assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame(("ABCD")));
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame(("ABCD")));
    }

    @Test
    void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame(("ABAB")));
    }

    @Test
    void areFirstAndLastTwoCharactersTheSame_AnotherNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame(("A")));
    }

}

/*

Using assert methods to check expected results

assertEquals(expected, actual)
    - actual is the result of whatever operation

Test StringHelper methods - create an instance of it
1. Test truncateAInFirst2Positions()
    then test the truncate in 1st position method
    before refactoring:
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        assertEquals(expected, actual);

AACD => CD
ACD => CD
CDEF => CDEF - no A
CDAA => CDAA - "A" is not in the 1st position, so it should not be truncated

2. Test areFirstAndLastTwoCharactersTheSame()
    before refactoring:
        boolean actual = helper.areFirstAndLastTwoCharactersTheSame(("ABCD"));
        boolean expected = false;
        assertEquals(expected, actual);


ABCD => false, ABAB => true, AB => true, A => false




 */