package com.java.interviewprog;

@SuppressWarnings("ALL")
public class DeleteInAHeap {
    public static void main(String[] args) {
        int array[]= new int[10];
        int elemnentsinHeap =5 ;
        deleteInAHeap(array,  elemnentsinHeap);
    }

    public  static void deleteInAHeap(int []array, int n){

        array[1]= array[n];
        n= n-1;
        int i =1;
        while(i<n){
            int left = array[2*i];
            int right = array[2*i+1];
            int largest = (left> right)? 2*i:2*i+1;
            if(array[i]< array[largest]){
                int temp = array[i];
                array[i] = array[largest];
                array[largest] = temp;
                i=largest;
            }
            else{
                return;
            }
        }

    }
}
