package com.java.interviewprog;

import java.util.Date;

public class BuilderDesignPattern {

    private  int roll, regNo;
    private  String name, parentName, city;
    private  Date admissionYear;


    private BuilderDesignPattern(Builder builder){
        this.roll= builder.roll;
        this.regNo=builder.regNo;
        this.name=builder.name;
        this.parentName= builder.parentName;
        this.admissionYear=builder.admissionYear;
        this.city= builder.city;
    }

    public int getRoll() {
        return roll;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public String getCity() {
        return city;
    }

    public Date getAdmissionYear() {
        return admissionYear;
    }

    public static class Builder{

        private final int roll, regNo;
        private final String name;
        private String parentName, city;
        private  Date admissionYear;

        public Builder(int roll, int regNo, String name){
            this.roll= roll;
            this.regNo = regNo;
            this.name= name;
        }

        public Builder setParentName(String parentName){
            this.parentName=parentName;
            return  this;
        }

        public Builder setCity(String  city){
            this.city=city;
            return this;
        }

        public BuilderDesignPattern build(){
            return new BuilderDesignPattern(this);
        }

    }

}

 class  BuilderDemo{
    public static void main(String[] args) {

        BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern.Builder(12,123,"builder").
                setParentName("parent").build();

        System.out.println(builderDesignPattern.getParentName());
        System.out.println(builderDesignPattern.getAdmissionYear());
    }
}
