package com.zessin.lesson2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolutionTest extends TestCase {

    private final int arraySize = 3;
    private final Solution solution;
    private final int[] originalArray;

    public SolutionTest(String testName) {
        super(testName);

        solution = new Solution();
        originalArray = new int[arraySize];
        originalArray[0] = 10;
        originalArray[1] = 20;
        originalArray[2] = 30;
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    public void testNoRotations() {
        int numberOfRotations = 0;
        int[] expectedArray = new int[arraySize];

        expectedArray[0] = 10;
        expectedArray[1] = 20;
        expectedArray[2] = 30;

        int[] rotatedArray = solution.solution(originalArray, numberOfRotations);

        assertResults(expectedArray, rotatedArray);
    }

    public void testOneRotation() {
        int numberOfRotations = 1;
        int[] expectedArray = new int[3];

        expectedArray[0] = 30;
        expectedArray[1] = 10;
        expectedArray[2] = 20;

        int[] rotatedArray = solution.solution(originalArray, numberOfRotations);

        assertResults(expectedArray, rotatedArray);
    }

    public void testTwoRotations() {
        int numberOfRotations = 2;
        int[] expectedArray = new int[3];

        expectedArray[0] = 20;
        expectedArray[1] = 30;
        expectedArray[2] = 10;

        int[] rotatedArray = solution.solution(originalArray, numberOfRotations);

        assertResults(expectedArray, rotatedArray);
    }

    public void testRotationsSameAsSizeOfArray() {
        int numberOfRotations = 3;
        int[] expectedArray = new int[3];

        expectedArray[0] = 10;
        expectedArray[1] = 20;
        expectedArray[2] = 30;

        int[] rotatedArray = solution.solution(originalArray, numberOfRotations);

        assertResults(expectedArray, rotatedArray);
    }

    public void testRotationsGreaterThanSizeOfArray() {
        int numberOfRotations = 4;
        int[] expectedArray = new int[3];

        expectedArray[0] = 30;
        expectedArray[1] = 10;
        expectedArray[2] = 20;

        int[] rotatedArray = solution.solution(originalArray, numberOfRotations);

        assertResults(expectedArray, rotatedArray);
    }

    private void assertResults(int[] expectedArray, int[] rotatedArray) {
        for (int i = 0; i < rotatedArray.length; i++) {
            assertEquals(String.format("The rotated value in position %s is incorrect", i), expectedArray[i], rotatedArray[i]);
        }
    }

}
