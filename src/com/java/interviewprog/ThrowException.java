package com.java.interviewprog;

import java.io.FileNotFoundException;

public class ThrowException {

    int num;

    public ThrowException(int num) {
        this.num = num;
    }

    public void checkNumber(int n) {
        if (this.num < n) {
            throw new RuntimeException("number is less ");
        }
        System.out.println("numnber is more");
    }

    public void propogateCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public void propagateUncheckedException() {
        throw new RuntimeException();
    }


}

class ExceptionMain {
    public static void main(String[] args) {

        ThrowException t = new ThrowException(5);
        //   t.checkNumber(30);
        /*try {
            t.propogateCheckedException();
        }catch (Exception e){
            System.out.println("exception caught ");
        }*/

        t.propagateUncheckedException();

    }
}
