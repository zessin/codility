package com.zessin.lesson2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OddOccurrencesInArrayTest extends TestCase {

    private final OddOccurrencesInArray oddOccurrencesInArray;

    public OddOccurrencesInArrayTest(String testName) {
        super(testName);

        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    public static Test suite() {
        return new TestSuite(OddOccurrencesInArrayTest.class);
    }

    public void testWithNoRepeatingPairs() {
        int expectedUnpairedElement = 40;
        int[] array = new int[7];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = expectedUnpairedElement;
        array[4] = 30;
        array[5] = 20;
        array[6] = 10;

        int unpairedElement = oddOccurrencesInArray.solution(array);
        assertEquals("The expected unpaired element is " + expectedUnpairedElement, expectedUnpairedElement, unpairedElement);
    }

    public void testWithRepeatingPairs() {
        int expectedUnpairedElement = 40;
        int[] array = new int[11];

        array[0] = 10;
        array[1] = 10;
        array[2] = 30;
        array[3] = expectedUnpairedElement;
        array[4] = 30;
        array[5] = 10;
        array[6] = expectedUnpairedElement;
        array[7] = 30;
        array[8] = expectedUnpairedElement;
        array[9] = 30;
        array[10] = 10;


        int unpairedElement = oddOccurrencesInArray.solution(array);
        assertEquals("The expected unpaired element is " + expectedUnpairedElement, expectedUnpairedElement, unpairedElement);
    }

}
