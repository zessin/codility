package com.zessin.lesson5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PassingCarsTest extends TestCase {

    private final PassingCars passingCars;

    public PassingCarsTest(String testName) {
        super(testName);

        passingCars = new PassingCars();
    }

    public static Test suite() {
        return new TestSuite(PassingCarsTest.class);
    }

    public void testWithCarsTravelingBothEastAndWest() {
        int[] array = new int[5];

        array[0] = 0;
        array[1] = 1;
        array[2] = 0;
        array[3] = 1;
        array[4] = 1;

        int expectedNumberOfPassingCars = 5;
        int numberOfPassingCars = passingCars.solution(array);

        assertEquals("The expected number of passing cars is " + expectedNumberOfPassingCars, expectedNumberOfPassingCars, numberOfPassingCars);
    }

    public void testWithCarsTravelingOnlyEast() {
        int[] array = new int[5];

        array[0] = 0;
        array[1] = 0;
        array[2] = 0;
        array[3] = 0;
        array[4] = 0;

        int expectedNumberOfPassingCars = 0;
        int numberOfPassingCars = passingCars.solution(array);

        assertEquals("The expected number of passing cars is " + expectedNumberOfPassingCars, expectedNumberOfPassingCars, numberOfPassingCars);
    }

    public void testWithCarsTravelingOnlyWest() {
        int[] array = new int[5];

        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;

        int expectedNumberOfPassingCars = 0;
        int numberOfPassingCars = passingCars.solution(array);

        assertEquals("The expected number of passing cars is " + expectedNumberOfPassingCars, expectedNumberOfPassingCars, numberOfPassingCars);
    }

}
