package com.java.interviewprog;

public class ArrayOfLeaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
        System.out.println("*******");
        printLeaders(new int[]{1, 2, 3, 4, 0});
    }

    static void printLeaders(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(arr[i] + " ");
            }


        }
        System.out.println("");
    }

}
