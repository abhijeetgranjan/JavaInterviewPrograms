package com.java.interviewprog;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int ar1[] = {2, 3, 8, 13};
        int ar2[] = {1, 5, 9, 10, 15, 20};

        int i=0 , j=0, k= ar1.length-1;

        for (int l = 0; l < ar1.length ; l++) {

            if( ar1[i] < ar2[j]){
                i++;
            }else{
                int temp = ar1[k];
                ar1[k]= ar2[j];
                ar2[j]= temp;
                j++;
                k--;
            }
        }

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        for(int m : ar1){
            System.out.print(m+" ");
        }
        System.out.println();
        for(int n : ar2){
            System.out.print(n+" ");
        }

    }
}
