package com.java.interviewprog;

public class BestTimeToBuyStocks {
    public static void main(String[] args) {
        int []array ={7,1,5,3,6,4};
        int best= bestTimeToBuy(array);
        System.out.println(best);

        int []array1 ={3,1,4,8,7,2,5};
        int best1= bestTimeToBuy(array1);
        System.out.println(best1);

        int []array2 ={7,6,4,3,1};
        int best2= bestTimeToBuy(array2);
        System.out.println(best2);
    }

    public static int bestTimeToBuy(int[]array){
        int max=0 ;
        int min=array[0];
        for (int i = 1; i < array.length-1; i++) {
            min = Math.min(min,array[i]);
            int diff= array[i]-min;
            if(max<diff){
                max=diff;
            }
        }
        return max;
    }
}
