package com.zessin.lesson3;

/**
 *
    A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

    Your goal is to find that missing element.

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given a zero-indexed array A, returns the value of the missing element.

    For example, given array A such that:

      A[0] = 2
      A[1] = 3
      A[2] = 1
      A[3] = 5
    the function should return 4, as it is the missing element.

    Assume that:

    N is an integer within the range [0..100,000];
    the elements of A are all distinct;
    each element of array A is an integer within the range [1..(N + 1)].
    Complexity:

    expected worst-case time complexity is O(N);
    expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
    Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 * @author Zessin
 *
 */
public class PermMissingElem {

    public int solution(int[] array) {
        int sumOfElementsInArray = 0;
        int sumOfElementsFromOneToArrayLength = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfElementsInArray = sumOfElementsInArray + array[i];
        }

        for (int i = 1; i <= array.length + 1; i++) {
            sumOfElementsFromOneToArrayLength = sumOfElementsFromOneToArrayLength + i;
        }

        return sumOfElementsFromOneToArrayLength - sumOfElementsInArray;
    }

}
