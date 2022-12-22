package com.newproject.javafile.javaio;

import com.newproject.exercises.JavaIO;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        JavaIO javaIO=new JavaIO();
        String stringBuffer = "Java Basic\n" +
                "Hello World\n" +
                "I love java coding\n" +
                "Test result\n";
        javaIO.writeToFile("Test-Data"+System.currentTimeMillis(),"CubeCart-test",".txt", stringBuffer);
    }
}
