package com.newproject.multithreadingdemo;

public class MultiThreadTest {
    public static void main(String[] args) {
        //print multiple message on the screen parallel;
        MultiPrintingDemo multiPrintingDemo1=new MultiPrintingDemo("Test1");
        MultiPrintingDemo multiPrintingDemo2=new MultiPrintingDemo("Test2");
        MultiPrintingDemo multiPrintingDemo3=new MultiPrintingDemo("Test3");
        MultiPrintingDemo multiPrintingDemo4=new MultiPrintingDemo("Test4");

        Thread thread1=new Thread(multiPrintingDemo1);
        Thread thread2=new Thread(multiPrintingDemo2);
        Thread thread3=new Thread(multiPrintingDemo3);
        Thread thread4=new Thread(multiPrintingDemo4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
