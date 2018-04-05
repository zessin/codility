package com.zessin.lesson3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TapeEquilibriumTest extends TestCase {

    private final TapeEquilibrium tapeEquilibrium;

    public TapeEquilibriumTest(String testName) {
        super(testName);

        tapeEquilibrium = new TapeEquilibrium();
    }

    public static Test suite() {
        return new TestSuite(TapeEquilibriumTest.class);
    }

    public void testOddNumberOfElements() {
        int[] array = new int[5];

        array[0] = 3;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        array[4] = 3;

        int expectedLeastDifference = 1;
        int leastDifference = tapeEquilibrium.solution(array);

        assertEquals("The expected least difference is " + expectedLeastDifference, expectedLeastDifference, leastDifference);
    }

    public void testEvenNumberOfElements() {
        int[] array = new int[4];

        array[0] = 20;
        array[1] = 30;
        array[2] = 50;
        array[3] = 40;

        int expectedLeastDifference = 40;
        int leastDifference = tapeEquilibrium.solution(array);

        assertEquals("The expected least difference is " + expectedLeastDifference, expectedLeastDifference, leastDifference);
    }

}
