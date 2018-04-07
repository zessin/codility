package com.zessin.lesson5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CountDivTest extends TestCase {

    private final CountDiv countDiv;

    public CountDivTest(String testName) {
        super(testName);

        countDiv = new CountDiv();
    }

    public static Test suite() {
        return new TestSuite(CountDivTest.class);
    }

    public void testWithDivisibleNumbers() {
        int firstInteger = 0;
        int lastInteger = 11;
        int divider = 2;
        int expectedDivisibleNumbersCount = 6;
        int divisibleNumbersCount = countDiv.solution(firstInteger, lastInteger, divider);

        assertEquals("The expected count of divisible numbers is " + expectedDivisibleNumbersCount, expectedDivisibleNumbersCount, divisibleNumbersCount);
    }

    public void testWithNoDivisibleNumbers() {
        int firstInteger = 1;
        int lastInteger = 99;
        int divider = 100;
        int expectedDivisibleNumbersCount = 0;
        int divisibleNumbersCount = countDiv.solution(firstInteger, lastInteger, divider);

        assertEquals("The expected count of divisible numbers is " + expectedDivisibleNumbersCount, expectedDivisibleNumbersCount, divisibleNumbersCount);
    }

}
