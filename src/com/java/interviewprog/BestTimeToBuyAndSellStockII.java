package com.java.interviewprog;

/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        int best = bestTimeToBuy(array);
        System.out.println(best);

        int[] array1 = {10, 22, 5, 75, 65, 80};
        int best1 = bestTimeToBuy(array1);
        System.out.println(best1);
    }

    public static int bestTimeToBuy(int[]array){
        int sum=0;
        int diff;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1]> array[i]){
                diff= array[i+1]- array[i];
                sum = sum+diff;
            }
        }
        return sum;
    }
}
