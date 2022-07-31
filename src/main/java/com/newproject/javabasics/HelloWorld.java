package com.newproject.javabasics;

public class HelloWorld {
    //Short cut psvm
    //Short cut sout
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        System.out.println("My name is Risa. I live in Osaka.");
        //*
        //* *
        //* * *
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");

        System.out.println(" *\n * * \n * * * ");
        System.out.println("*\t * *\t * * *");

        for (double i = 1.5; i > -1.5; i-=0.1) {
            for (double j = -2; j<2;j+=0.05 ){
                double a = i*i+j*j-1;
                if ((a*a*a-i*i*i*j*j) <=0.0){
                    Thread.sleep(10);
                    System.out.print("k");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

}
