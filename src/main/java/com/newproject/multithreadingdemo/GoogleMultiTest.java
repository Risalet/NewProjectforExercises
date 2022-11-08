package com.newproject.multithreadingdemo;

public class GoogleMultiTest {
    public static void main(String[] args) {
        MultiGoogleSearch multiGoogleSearch1=new MultiGoogleSearch("Java");
        MultiGoogleSearch multiGoogleSearch2=new MultiGoogleSearch("Python");
        MultiGoogleSearch multiGoogleSearch3=new MultiGoogleSearch("C++");
        MultiGoogleSearch multiGoogleSearch4=new MultiGoogleSearch("C#");

        Thread thread1=new Thread( multiGoogleSearch1);
        Thread thread2=new Thread( multiGoogleSearch2);
        Thread thread3=new Thread( multiGoogleSearch3);
        Thread thread4=new Thread( multiGoogleSearch4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



    }

}
