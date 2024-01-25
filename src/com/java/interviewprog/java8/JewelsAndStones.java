package com.java.interviewprog.java8;

public class JewelsAndStones {

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones("aA","aAAbbbb"));
        System.out.println(jewelsAndStones.numJewelsInStones("z","ZZ"));
    }

    public int numJewelsInStones(String jewels, String stones) {

        int array[] = new int[256];

        for (int i = 0; i < stones.length(); i++) {
            int curr = stones.charAt(i);
            array[curr]++;
        }
        int sum =0;

        for (int i = 0; i < jewels.length(); i++) {
            int curr = jewels.charAt(i);
            int value = array[curr];
            sum = sum+value;
        }
        return sum;
    }
}
