package com.zessin.lesson4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FrogRiverOneTest extends TestCase {

    private final FrogRiverOne frogRiverOne;

    public FrogRiverOneTest(String testName) {
        super(testName);

        frogRiverOne = new FrogRiverOne();
    }

    public static Test suite() {
        return new TestSuite(FrogRiverOneTest.class);
    }

    public void testSuccess() {
        int[] array = new int[8];
        int numberOfLeaves = 5;

        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 4;
        array[4] = 2;
        array[5] = 3;
        array[6] = numberOfLeaves;
        array[7] = 4;

        int expectedResult = 6;
        int result = frogRiverOne.solution(numberOfLeaves, array);

        assertEquals("The expected result is " + expectedResult, expectedResult, result);
    }

    public void testFailure() {
        int[] array = new int[8];
        int numberOfLeaves = 5;

        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 4;
        array[4] = 2;
        array[5] = 3;
        array[6] = 1;
        array[7] = 4;

        int expectedResult = -1;
        int result = frogRiverOne.solution(numberOfLeaves, array);

        assertEquals("The expected result is " + expectedResult, expectedResult, result);
    }

}
