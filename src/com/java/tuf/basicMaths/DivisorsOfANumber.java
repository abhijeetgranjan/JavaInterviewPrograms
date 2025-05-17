package com.java.tuf.basicMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DivisorsOfANumber {
    public int[] divisors(int n) {
        int i = 1;
        List<Integer> list = new ArrayList<>();
        while (i <= n) {
            if (n % i == 0) {
                list.add(i);
            }
            i++;
        }
        int[] array = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);
        }


        return array;
    }

    public static void main(String[] args) {
        DivisorsOfANumber divisors = new DivisorsOfANumber();
        int[] divisors1 = divisors.divisors(8);
        System.out.println(Arrays.toString(divisors1));
    }
}
