package com.java.interviewprog;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        ThreeConsecutiveOdds threeConsecutiveOdds = new ThreeConsecutiveOdds();
        boolean b = threeConsecutiveOdds.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12});
        System.out.println(b);
    }

    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }

        }
        return false;
    }
}
