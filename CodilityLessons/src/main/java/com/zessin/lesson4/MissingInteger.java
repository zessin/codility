package com.zessin.lesson4;

import java.util.HashSet;

/**
 *
    This is a demo task.

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

    Given A = [1, 2, 3], the function should return 4.

    Given A = [-1, -3], the function should return 1.

    Assume that:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [-1,000,000..1,000,000].
    Complexity:

    expected worst-case time complexity is O(N);
    expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
    Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 * @author Zessin
 *
 */
public class MissingInteger {

    public int solution(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        int smallestInteger = 1;

        for (int i = 0 ; i < array.length; i++) {
            hashSet.add(array[i]);
        }

        while (hashSet.contains(smallestInteger)) {
            smallestInteger++;
        }

        return smallestInteger;
    }

}
