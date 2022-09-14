package com.newproject.exercises;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner insert=new Scanner(System.in);
        System.out.println("please insert some numbers ");
        int positiveNumberCounts=0;
        int negativeNumberCounts=0;
        while(true){
            int numbers=insert.nextInt();
            if (numbers>0){
                positiveNumberCounts++;
            }
            else if (numbers<0){
                negativeNumberCounts++;
            }
            else
                break;
        }
        System.out.println("Negative number counts are: "+negativeNumberCounts);
        System.out.println("Positive number counts are :"+positiveNumberCounts);




    }
}
