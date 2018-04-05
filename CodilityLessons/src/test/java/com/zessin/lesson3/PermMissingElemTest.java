package com.zessin.lesson3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PermMissingElemTest extends TestCase {

    private final PermMissingElem permMissingElem;

    public PermMissingElemTest(String testName) {
        super(testName);

        permMissingElem = new PermMissingElem();
    }

    public static Test suite() {
        return new TestSuite(PermMissingElemTest.class);
    }

    public void testFirstElementMissing() {
        int[] array = new int[4];

        array[0] = 2;
        array[1] = 3;
        array[2] = 4;
        array[3] = 5;

        int expectedMissingElement = 1;
        int missingElement = permMissingElem.solution(array);

        assertEquals("The expected missing element is " + expectedMissingElement, expectedMissingElement, missingElement);
    }

    public void testMiddleElementMissing() {
        int[] array = new int[4];

        array[0] = 2;
        array[1] = 3;
        array[2] = 1;
        array[3] = 5;

        int expectedMissingElement = 4;
        int missingElement = permMissingElem.solution(array);

        assertEquals("The expected missing element is " + expectedMissingElement, expectedMissingElement, missingElement);
    }

    public void testLastElementMissing() {
        int[] array = new int[4];

        array[0] = 2;
        array[1] = 3;
        array[2] = 1;
        array[3] = 4;

        int expectedMissingElement = 5;
        int missingElement = permMissingElem.solution(array);

        assertEquals("The expected missing element is " + expectedMissingElement, expectedMissingElement, missingElement);
    }

}
