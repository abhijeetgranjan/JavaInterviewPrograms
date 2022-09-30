package com.java.interviewprog;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {


        File file = new File("abc.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(" hi , I am writing to a file");
        printWriter.println(" using printwriter");
        printWriter.println(" writing finished");

        printWriter.flush();
        printWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();

        while (line!=null){
            System.out.println(line);
            line= bufferedReader.readLine();
        }

    }
}
