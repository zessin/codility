package com.zessin.lesson2;

public class Solution {

    public int[] solution(int[] originalArray, int numberOfRotations) {
        int[] rotatedArray = new int[originalArray.length];
        int maxIndex = originalArray.length - 1;

        for (int i = 0; i < originalArray.length; i++) {
            int newIndex = i + numberOfRotations;

            if (newIndex <= maxIndex) {
                rotatedArray[newIndex] = originalArray[i];
            } else {
                rotatedArray[newIndex % originalArray.length] = originalArray[i];
            }
        }

        return rotatedArray;
    }

}
