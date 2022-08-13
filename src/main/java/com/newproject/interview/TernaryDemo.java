package com.newproject.interview;

public class TernaryDemo {
    public static void main(String[] args) {
        int x=100;
        int y=200;
        int max=(x>y)?x:y;
        System.out.printf("Max value of %d and %d is %d \n" ,x,y,max);
        System.out.println(Math.max(x,y));
    }
}