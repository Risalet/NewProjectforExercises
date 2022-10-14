package com.newproject.exceptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) throws InterruptedException {
        test();
        test1();

    }

    public static void test(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test1() throws InterruptedException {
        Thread.sleep(3000);
    }
}
