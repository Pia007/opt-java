package com.in28minutes.junit.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @Test
    void truncateAInFirst2Positions() {
        StringHelper helper = new StringHelper();
        // refactored
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
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

 */