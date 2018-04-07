package com.zessin.lesson4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MaxCountersTest extends TestCase {

    private final MaxCounters maxCounters;

    public MaxCountersTest(String testName) {
        super(testName);

        maxCounters = new MaxCounters();
    }

    public static Test suite() {
        return new TestSuite(MaxCountersTest.class);
    }

    public void testWithOnlyIncreaseOperations() {
        int[] array = new int[7];

        array[0] = 3;
        array[1] = 4;
        array[2] = 4;
        array[3] = 2;
        array[4] = 1;
        array[5] = 4;
        array[6] = 4;

        int[] expectedArrayOfCounters = new int[] { 1, 1, 1, 4, 0 };
        int[] arrayOfCounters = maxCounters.solution(5, array);

        for (int i = 0; i < arrayOfCounters.length; i++) {
            assertEquals("The expected value of counter " + i + " is " + expectedArrayOfCounters[i], expectedArrayOfCounters[i], arrayOfCounters[i]);
        }
    }

    public void testWithOnlyMaxOperations() {
        int[] array = new int[7];

        array[0] = 6;
        array[1] = 6;
        array[2] = 6;
        array[3] = 6;
        array[4] = 6;
        array[5] = 6;
        array[6] = 6;

        int[] expectedArrayOfCounters = new int[] { 0, 0, 0, 0, 0 };
        int[] arrayOfCounters = maxCounters.solution(5, array);

        for (int i = 0; i < arrayOfCounters.length; i++) {
            assertEquals("The expected value of counter " + i + " is " + expectedArrayOfCounters[i], expectedArrayOfCounters[i], arrayOfCounters[i]);
        }
    }

    public void testWithMixedOperations() {
        int[] array = new int[7];

        array[0] = 3;
        array[1] = 4;
        array[2] = 4;
        array[3] = 6;
        array[4] = 1;
        array[5] = 4;
        array[6] = 4;

        int[] expectedArrayOfCounters = new int[] { 3, 2, 2, 4, 2 };
        int[] arrayOfCounters = maxCounters.solution(5, array);

        for (int i = 0; i < arrayOfCounters.length; i++) {
            assertEquals("The expected value of counter " + i + " is " + expectedArrayOfCounters[i], expectedArrayOfCounters[i], arrayOfCounters[i]);
        }
    }

}
