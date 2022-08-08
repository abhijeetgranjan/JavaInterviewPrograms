package com.java.interviewprog;

public class InsertInHeap {
    static int[] heapArray = new int[50];
    static int index = 0;

    public static void main(String[] args) {
        insertInHeap(50);
        insertInHeap(30);
        insertInHeap(40);
        insertInHeap(10);
        insertInHeap(5);
        insertInHeap(20);
        insertInHeap(30);
        insertInHeap(56);
        insertInHeap(12);

        print();

    }

    public static void print() {
        for (int i = 1; i <= index / 2; i++) {

            // Printing the parent and both childrens
            System.out.print(
                    " PARENT : " + heapArray[i]
                            + " LEFT CHILD : " + heapArray[2 * i]
                            + " RIGHT CHILD :" + heapArray[2 * i + 1]);

            // By here new line is required
            System.out.println();
        }
    }

    public static void insertInHeap(int value) {

        if (index > heapArray.length) {
            return;
        }
        heapArray[++index] = value;

        int ctr = index;
        while (ctr > 1) {
            int parent = ctr / 2;
            if (heapArray[ctr] > heapArray[parent]) {
                int temp = heapArray[ctr];
                heapArray[ctr] = heapArray[parent];
                heapArray[parent] = temp;
                ctr = parent;
            } else
                return;
        }


    }

}
