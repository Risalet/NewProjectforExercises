package com.newproject.datatypes;

public class ArgumentDemo {
    public static void main(String[] args) {
        int i1=Integer.parseInt(args[0]);
        int i2=Integer.parseInt(args[1]);
        int i3=Integer.parseInt(args[2]);
        System.out.printf("%d+%d+%d=%d\n",i1,i2,i3,i1+i2+i3);
        System.out.printf("My school and course Name: " +args[4] +" "+args[5]);



    }
}
