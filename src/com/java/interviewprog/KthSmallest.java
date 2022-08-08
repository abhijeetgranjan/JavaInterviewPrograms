package com.java.interviewprog;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] array = {100, 45, -15, 11, -1, 65, 21};
        int k = 3;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(3, Comparator.reverseOrder());
        for(int i=0; i<k; i++){
            priorityQueue.add(array[i]);
        }

        for (int i = k; i < array.length; i++) {
            if(priorityQueue.peek()> array[i]){
                priorityQueue.poll();
                priorityQueue.add(array[i]);
            }
        }
        System.out.println(priorityQueue.peek());
    }
}
