package com.java.interviewprog;

public class InheritanceProblem {

    int value = 10;
    void run(){
        System.out.println(" InheritanceProblem class run called");
    }
    void test(){
        System.out.println(" test from second class");
    }
}

class Second extends  InheritanceProblem{
    int value =20;
    void run(){
        System.out.println(" Second class run called");
    }

    void second(){
        System.out.println(" method from second class");
    }
}

class  Main{
    public static void main(String[] args) {

        Second second = new Second();
        second.run();
        second.second();
        second.test();

        InheritanceProblem inheritanceProblem = new InheritanceProblem();
        inheritanceProblem.run();


        InheritanceProblem childObject = new Second();
        childObject.run();
        childObject.test();
        System.out.println(childObject.value);
        //   childObject.second(); will throw an error  parent reference  can't call child methods, as it has only access
        //   to parent members

      //  Second second1 = new InheritanceProblem(); will throw an error

    }
}
