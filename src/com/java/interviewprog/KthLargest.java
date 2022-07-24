package com.java.interviewprog;

/*
To find the Kth  largest element in an array , we use the priority queue, which is based on max heap concept.
we make a queue of initial capacity with K and first fill it with k elements, and then we check if the next element is
greater than the top most element we replace the top position with the element, in this way we get the kth largest element.
 */

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] array = {100, 45, -15, 11, -1, 65, 21};
        int k = 3;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(3);

        for(int i=0; i<k; i++){
            priorityQueue.add(array[i]);
        }

        for (int i = k; i < array.length; i++) {
            if(priorityQueue.peek()<array[i]){
                priorityQueue.poll();
                priorityQueue.add(array[i]);
            }
        }
        System.out.println(priorityQueue.peek());
    }
}
