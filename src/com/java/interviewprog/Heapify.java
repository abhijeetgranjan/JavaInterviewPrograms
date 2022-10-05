package com.java.interviewprog;

public class Heapify {
   static  int[] array = new int [10];
    static int size=0;
    public static void main(String[] args) {
        insert(5);
        insert(3);
        insert(17);
        insert(10);
        insert(84);
        insert(19);
        insert(6);
        insert(22);
        insert(9);

        for(int i=0; i <size; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    private static void insert(int i) {
//5 3 17 10 84 19 6 22 9
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
