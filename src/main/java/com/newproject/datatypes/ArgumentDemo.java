package com.newproject.datatypes;

public class ArgumentDemo {
    public static void main(String[] args) {
        int i1=Integer.parseInt(args[0]);
        int i2=Integer.parseInt(args[1]);
        int i3=Integer.parseInt(args[2]);
        System.out.printf("%d+%d+%d=%d\n",i1,i2,i3,i1+i2+i3);



        String s="5";
        String s1="5";
        int i=20;
        System.out.println(s+s1);
        System.out.println(i+s);
    }
}
