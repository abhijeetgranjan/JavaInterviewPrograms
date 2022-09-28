package com.java.interviewprog.java8;

import java.util.HashMap;
import java.util.Map;

public final class PracticeTest {
    private  final int eid;
    private final String ename;
    private final HashMap<Integer,String> edetail ;


    public PracticeTest(int eid, String ename, HashMap<Integer, String> edetail) {
        this.eid = eid;
        this.ename = ename;
       HashMap<Integer,String> temp = new HashMap<>();
       for(Map.Entry<Integer,String> entry: edetail.entrySet()){
           temp.put(entry.getKey(),entry.getValue());
       }
        this.edetail = temp;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public HashMap<Integer, String> getEdetail() {
        HashMap<Integer,String> temp = new HashMap<>();
        for(Map.Entry<Integer,String> entry: edetail.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }
       return temp;
    }
}














