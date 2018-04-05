package com.zessin.lesson4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PermCheckTest extends TestCase {

    private final PermCheck permCheck;

    public PermCheckTest(String testName) {
        super(testName);

        permCheck = new PermCheck();
    }

    public static Test suite() {
        return new TestSuite(PermCheckTest.class);
    }

    public void testEvenNumberOfElementsWithPermutationArray() {
        int[] array = new int[4];

        array[0] = 4;
        array[1] = 1;
        array[2] = 3;
        array[3] = 2;

        int expectedResult = 1;
        int result = permCheck.solution(array);

        assertEquals("The expected result is " + expectedResult, expectedResult, result);
    }

    public void testEvenNumberOfElementsWithNoPermutationArray() {
        int[] array = new int[4];

        array[0] = 4;
        array[1] = 5;
        array[2] = 3;
        array[3] = 2;

        int expectedResult = 0;
        int result = permCheck.solution(array);

        assertEquals("The expected result is " + expectedResult, expectedResult, result);
    }

    public void testOddNumberOfElementsWithPermutationArray() {
        int[] array = new int[3];

        array[0] = 2;
        array[1] = 1;
        array[2] = 3;

        int expectedResult = 1;
        int result = permCheck.solution(array);

        assertEquals("The expected result is " + expectedResult, expectedResult, result);
    }

    public void testOddNumberOfElementsWithNoPermutationArray() {
        int[] array = new int[3];

        array[0] = 4;
        array[1] = 1;
        array[2] = 3;

        int expectedResult = 0;
        int result = permCheck.solution(array);

        assertEquals("The expected result is " + expectedResult, expectedResult, result);
    }

}
