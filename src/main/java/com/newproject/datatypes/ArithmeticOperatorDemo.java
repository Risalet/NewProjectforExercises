package com.newproject.datatypes;

public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        int width =10;
        int height =5;
        int area = width*height;
        int premiere =2*(width+height);
        System.out.println("Area of rectangle is :"+area);
        System.out.println("Premiere of rectangle :"+premiere);

        float division = width/height;
        System.out.println("division=.2f% "+(int)division);

        //reminder --kalduk
        System.out.println(5%3);//2
        System.out.println(9%8);//1
        System.out.println(10%5);//0

        //increment decrement
        int i=1;
        int j=2;
        i++; j--;
        System.out.println(i);
        System.out.println(j);

        i++;
        j--;
        System.out.println(i);
        System.out.println(j);



    }

}
