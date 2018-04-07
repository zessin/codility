package com.zessin.lesson4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MissingIntegerTest extends TestCase {

    private final MissingInteger missingInteger;

    public MissingIntegerTest(String testName) {
        super(testName);

        missingInteger = new MissingInteger();
    }

    public static Test suite() {
        return new TestSuite(MissingIntegerTest.class);
    }

    public void testFullOfNegativeElements() {
        int[] array = new int[6];

        array[0] = -50;
        array[1] = -10;
        array[2] = -80;
        array[3] = -30;
        array[4] = -40;
        array[5] = -1;

        int expectedSmallestInteger = 1;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

    public void testFullOfSameNegativeElements() {
        int[] array = new int[6];

        array[0] = -50;
        array[1] = -50;
        array[2] = -50;
        array[3] = -50;
        array[4] = -50;
        array[5] = -50;

        int expectedSmallestInteger = 1;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

    public void testFullOfPositiveElements() {
        int[] array = new int[6];

        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 4;
        array[4] = 1;
        array[5] = 2;

        int expectedSmallestInteger = 5;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

    public void testFullOfSamePositiveElements() {
        int[] array = new int[6];

        array[0] = 2;
        array[1] = 2;
        array[2] = 2;
        array[3] = 2;
        array[4] = 2;
        array[5] = 2;

        int expectedSmallestInteger = 1;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

    public void testWithPositiveAndNegativeElements() {
        int[] array = new int[10];

        array[0] = -2;
        array[1] = 2;
        array[2] = 3;
        array[3] = 1;
        array[4] = 1;
        array[5] = 5;
        array[6] = 4;
        array[7] = 8;
        array[8] = 9;
        array[9] = 20;

        int expectedSmallestInteger = 6;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

    public void testWithOneAsSmallestElement() {
        int[] array = new int[10];

        array[0] = -2;
        array[1] = 2;
        array[2] = 3;
        array[3] = 7;
        array[4] = 3;
        array[5] = 5;
        array[6] = 4;
        array[7] = 8;
        array[8] = 9;
        array[9] = 20;

        int expectedSmallestInteger = 1;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

    public void testWithLastElementAsSmallestElement() {
        int[] array = new int[10];

        array[0] = -2;
        array[1] = 1;
        array[2] = 3;
        array[3] = 6;
        array[4] = 2;
        array[5] = 5;
        array[6] = 4;
        array[7] = 9;
        array[8] = 8;
        array[9] = 7;

        int expectedSmallestInteger = 10;
        int smallestInteger = missingInteger.solution(array);

        assertEquals("The expected smallest integer is " + expectedSmallestInteger, expectedSmallestInteger, smallestInteger);
    }

}
