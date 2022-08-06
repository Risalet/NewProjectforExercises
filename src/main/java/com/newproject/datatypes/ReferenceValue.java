package com.newproject.datatypes;

public class ReferenceValue {
    public static void main(String[] args) {
        int x =100;
        int y =200;

        int tempValue=x;
        x=y;
        y=tempValue;

        System.out.println("Value of x is: "+x);
        System.out.println("Value od u is: "+y);

    }



}
