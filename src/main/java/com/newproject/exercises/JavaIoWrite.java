package com.newproject.exercises;

public class JavaIoWrite {
    public static void main(String[] args) {
        JavaIO javaIO=new JavaIO();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Java Basic\n");
        stringBuffer.append("Hello World\n");
        stringBuffer.append("I love java coding\n");
        stringBuffer.append("Test result\n");
        javaIO.writeToFile("Test-Data"+System.currentTimeMillis(),"CubeCart-test",".txt", stringBuffer.toString());
    }
}
