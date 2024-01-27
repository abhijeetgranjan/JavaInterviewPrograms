package com.java.interviewprog;

public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes primes = new CountPrimes();
        System.out.println(primes.count(10));
        System.out.println(primes.countbySieve(10));
        System.out.println(primes.count(0));
        System.out.println(primes.countbySieve(0));
        System.out.println(primes.count(1));
        System.out.println(primes.countbySieve(1));
        System.out.println(primes.count(15));
        System.out.println(primes.countbySieve(15));
    }

    public int count(int number) {

        int count = 0;

        for (int i = 2; i < number; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }

    public int countbySieve(int n) {
        if(n<=1){
            return 0;
        }

        boolean array[]= new boolean[n];

        for (int i = 2; i < Math.sqrt(n); i++) {
            if(array[i]==false){
                for (int j = i*i; j < n; j= j+i) {
                    array[j]=true;
                }
            }
        }
        int count=0;
        for (int i = 2; i < n; i++) {
            if(array[i]==false){
                count++;
            }

        }
        return count;
    }
}
