package com.java.interviewprog;

public class ArrayProblem012 {
    public static void main(String[] args) {
        int array[] = {0,0,1,1,0,1,0,2,2};
        sortArrayOn012(array);
    }

    private static void sortArrayOn012(int[] array) {
        int count1=0, count0=0, count2=0;
        for( int i =0 ; i< array.length ; i++){
            if(array[i]==0){
                count0++;
            }else if (array[i]==1){
                count1++;
            }else {
                count2++;
            }
        }
        for( int i =0 ; i< count0 ; i++){
            array[i]=0;
        }
        for( int i =count0 ; i< (count0+count1) ; i++){
            array[i]=1;
        }
        for( int i =count0+count1 ; i< (array.length) ; i++){
            array[i]=2;
        }

        for( int i =0 ; i< array.length ; i++){
            System.out.print(array[i]+" ");
        }
    }

}
