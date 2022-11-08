package com.newproject.multithreadingdemo;

import java.util.Date;

public class MultiPrintingDemo implements Runnable{
    private String message;

    public MultiPrintingDemo(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i=0; i<3;i++) {
            Date date = new Date();
            System.out.println(date + " " + message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
