package com.in28minutes.junit.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    StringHelper helper = new StringHelper();

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

    @Test
    void areFirstAndLastTwoCharactersTheSame() {
    }
}

/*

using assert methods to check expected results

assertEquals(expected, actual)
    - actual is the result of whatever operation

test StringHelper() - create an instance of it
    then test the truncate in 1st position method
    before refactoring:
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        assertEquals(expected, actual);

AACD => CD
ACD => CD
CDEF => CDEF - no A
CDAA => CDAA - "A" is not in the 1st position, so it should not be truncated

Tips:

 */