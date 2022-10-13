package com.java.interviewprog;

public class TechM {

  /*

  Given an array {1, 2, 3, 4, 5, 6} with group(4) and iteration(7) , print the following output
1 2 3 4
5 6 1 2
3 4 5 6
1 2 3 4
5 6 1 2
3 4 5 6
1 2 3 4
   */

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int group = 4;
        int iteration = 7;
        int j = 0, count = 0;
        for (int i = 0; i < iteration; i++) {

            while (count < 4 && j <= array.length) {
                System.out.print(array[j] + " ");
                j++;
                count++;
                if (j == array.length ) {
                    j = 0;
                }
            }
            count = 0;
            System.out.println();


        }


    }
}
