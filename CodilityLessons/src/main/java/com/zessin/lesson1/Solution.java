package com.zessin.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int number) {
        String binaryString = Integer.toBinaryString(number);

        return findLongestGap(binaryString);
    }

    private int findLongestGap(String binaryString) {
        List<Integer> sizeOfGapsFound = new ArrayList<>();
        int gapSize = 0;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                sizeOfGapsFound.add(gapSize);
                gapSize = 0;
            } else {
                gapSize++;
            }
        }

        return sizeOfGapsFound.stream().reduce(Integer.MIN_VALUE, Integer::max);
    }

}
