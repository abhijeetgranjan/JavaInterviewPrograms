package com.java.interviewprog;

/*
Write an efficient program to find the sum of the contiguous
subarray within a one-dimensional array of numbers that has the largest sum.
 */

/*
logic : discard the sum if the continuous sum is < 0
 */
public class KadaneAlgorithm {
    public static void main (String[] args)
    {
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxContinuousSumInArray(array);
        int [] array2= {-1, -2, 4, 5, 6,-7, 10};
        maxContinuousSumInArray(array2);
        int [] array3= {-1, -2, -4, -5, -6,-7, -10};
        maxContinuousSumInArray(array3);
    }

    static void maxContinuousSumInArray(int[] array){
        int max = Integer.MIN_VALUE;
        int currentSum =0;

        for (int i = 0; i < array.length; i++) {
            currentSum = currentSum+ array[i];
            if(currentSum > max){
                max = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println(max);
    }
}
