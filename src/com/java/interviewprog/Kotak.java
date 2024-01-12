package com.java.interviewprog;

class BaseClass {
    protected void foo() {
        System.out.println("base class");
    }
}

class ChildClass {
    void foo() {
        System.out.println("child class");
    }
}


public class Kotak {


    public static void main(String[] args) {

        ChildClass c = new ChildClass();
        c.foo();
        String s = "abhi";
        String s1 = new String("abhi");

        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        String s3 = s;
        System.out.println(s == s3);
        System.out.println(s.equals(s3));


        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


        int a = 121, b = 121, dc = 3;

        System.out.println(a > b ? (a > dc ? a : dc) : b > dc ? b : dc);
        System.out.println("********");

        int n = 2
                ;
        boolean flag = true;
        for( int k =2; k<n/2; k++){
            if( n%k==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }else{
            System.out.println(" non prime ");
        }

    }
}
