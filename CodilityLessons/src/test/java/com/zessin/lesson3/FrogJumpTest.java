package com.zessin.lesson3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FrogJumpTest extends TestCase {

    private final FrogJump frogJump;

    public FrogJumpTest(String testName) {
        super(testName);

        frogJump = new FrogJump();
    }

    public static Test suite() {
        return new TestSuite(FrogJumpTest.class);
    }

    public void testPositionGreaterThanDesiredPosition() {
        int initialPosition = 10;
        int desiredPosition = 85;
        int jumpDistance = 30;
        int expectedNumberOfJumps = 3;
        int numberOfJumps = frogJump.solution(initialPosition, desiredPosition, jumpDistance);

        assertEquals("The expected number of jumps is " + expectedNumberOfJumps, expectedNumberOfJumps, numberOfJumps);
    }

    public void testPositionEqualToDesiredPosition() {
        int initialPosition = 85;
        int desiredPosition = 200;
        int jumpDistance = 5;
        int expectedNumberOfJumps = 23;
        int numberOfJumps = frogJump.solution(initialPosition, desiredPosition, jumpDistance);

        assertEquals("The expected number of jumps is " + expectedNumberOfJumps, expectedNumberOfJumps, numberOfJumps);
    }

}
