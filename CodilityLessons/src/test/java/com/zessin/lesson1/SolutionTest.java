package com.zessin.lesson1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolutionTest extends TestCase {

    private final Solution solution;

    public SolutionTest(String testName) {
        super(testName);

        solution = new Solution();
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    public void testCase1() {
        int number = 9;
        int expectedLongestBinaryGap = 2;
        int actualLongestBinaryGap = findLongestGap(number);

        assertResults(number, expectedLongestBinaryGap, actualLongestBinaryGap);
    }

    public void testCase2() {
        int number = 529;
        int expectedLongestBinaryGap = 4;
        int actualLongestBinaryGap = findLongestGap(number);

        assertResults(number, expectedLongestBinaryGap, actualLongestBinaryGap);
    }

    public void testCase3() {
        int number = 20;
        int expectedLongestBinaryGap = 1;
        int actualLongestBinaryGap = findLongestGap(number);

        assertResults(number, expectedLongestBinaryGap, actualLongestBinaryGap);
    }

    public void testCase4() {
        int number = 15;
        int expectedLongestBinaryGap = 0;
        int actualLongestBinaryGap = findLongestGap(number);

        assertResults(number, expectedLongestBinaryGap, actualLongestBinaryGap);
    }

    public void testCase5() {
        int number = 1041;
        int expectedLongestBinaryGap = 5;
        int actualLongestBinaryGap = findLongestGap(number);

        assertResults(number, expectedLongestBinaryGap, actualLongestBinaryGap);
    }

    private int findLongestGap(int number) {
        return solution.solution(number);
    }

    private void assertResults(int number, int expectedLongestBinaryGap, int actualLongestBinaryGap) {
        assertEquals(String.format("Longest binary gap should be %s for the number %s", expectedLongestBinaryGap, number), expectedLongestBinaryGap, actualLongestBinaryGap);
    }

}
