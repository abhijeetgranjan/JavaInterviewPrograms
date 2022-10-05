package com.java.interviewprog;

public class Heapify {
   static  int[] array = new int[] {5,3,17,10,84,19,6,22,9};
    static int size=0;
    public static void main(String[] args) {
        for (int i = 0; i < array.length-1 ; i++) {
            insert(array[i]);
        }

        for(int i=0; i <size; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    private static void insert(int i) {
        if (size == array.length) {
            System.out.println(" can't insert any more elements");
            return;
        }
        array[size] = i;
        fixHeapAbove(array, size);
        size++;
    }

    private static void fixHeapAbove(int[] array, int index) {
        int currentValue = array[index];
        int parentIndex = getParent(index);

        while( array[parentIndex] <currentValue){
            int temp = array[parentIndex];
            array[parentIndex]= currentValue;
            array[index]=temp;

            index = parentIndex;
            parentIndex = getParent(index);

        }

    }

    private static int getRightChild(int index){
        return (2*index)+1;
    }

    private static int getLeftChild(int index){
        return (2*index)+2;
    }

    private static int getParent(int index){
        return (index-1)/2;
    }





}
