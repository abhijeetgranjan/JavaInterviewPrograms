package com.java.tuf.basicRecursion;

//Time complexity  : O(n)
//space complexity : O(n)
public class PrintNTimesUsingRecursion {

    int count = 1;

    void print(String name){
        if( count == 10){
            return;
        }
        System.out.println(name);
        count++;
        print(name);
    }

    void print2(int start,int end, String name){

        if(start > end){
            return;
        }
        System.out.println(start +" "+ name);
        start++;
        print2(start,end,name);

    }

    public static void main(String[] args) {
        PrintNTimesUsingRecursion recursion = new PrintNTimesUsingRecursion();
        recursion.print("Abhijeet");
        System.out.println("*****************");
        recursion.print2(1, 10,"Abhijeet");

    }


}
