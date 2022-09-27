package com.java.interviewprog;

public final class ImmutableClass {

    private  final int value;

    ImmutableClass(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableClass modifyValue(int value){
        if(this.value == value){
            return  this;
        }
        return  new ImmutableClass(value);
    }
}

class ImmutableDemo{

    public static void main(String[] args) {

        ImmutableClass immutableClass= new ImmutableClass(5);
        System.out.println(immutableClass.hashCode());
        System.out.println(immutableClass == immutableClass.modifyValue(5));
        System.out.println(immutableClass.modifyValue(5).hashCode());
        System.out.println(immutableClass == immutableClass.modifyValue(15));
        System.out.println(immutableClass.modifyValue(15).hashCode());

    }
}
